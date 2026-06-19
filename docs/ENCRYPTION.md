# 三重加密（概念说明）

为保证备份数据在公有仓库中也保持不可读，我们采用“三重加密”策略（MVP 说明）：

1) 内容加密（CEK）
- 对备份内容使用随机生成的 CEK（Content Encryption Key，32 字节）进行 AES-256-GCM 对称加密。
- 保存密文、nonce（IV）和 tag（认证标签）。

2) 密码封装（Password wrap）
- 使用用户密码（如果用户设置了备份密码）通过 Argon2id 或 PBKDF2 派生 Key_PW。
- 用 Key_PW 对 CEK 进行封装（wrap），产生 WrappedKey_PW，用于跨设备恢复。

3) 设备密钥封装（Device wrap）
- 使用 Android Keystore 生成的设备私钥或对称密钥对 CEK 进行封装，产生 WrappedKey_DEV。
- WrappedKey_DEV 仅在原设备上可解密，以便无需密码快速恢复本地数据。

备份包包含：{
  metadata, wrapped_keys: {pw, dev}, encrypted_blob
}

恢复流程：
- 在原设备：使用 Keystore 解密 WrappedKey_DEV -> 获取 CEK -> 解密数据
- 在新设备：用户输入密码 -> 派生 Key_PW -> 解密 WrappedKey_PW -> 获取 CEK -> 解密数据

安全提醒：
- 若用户忘记密码且没有原设备，则无法恢复数据（除非用户提前导出恢复码）。
- 不要上传明文密码或未封装的 CEK 到仓库。

更多技术细节与实现我将在后续提交中提供示例代码（Kotlin + Android Keystore + Cipher）。
