# Dev branch: next steps

本次提交包含：
- Room 数据库实体/DAO/数据库（Server）
- Crypto 管理接口（占位）
- GitHubBackupClient 占位（client_id 已写入，client_secret 不会被写入）
- 基本 Compose UI 占位
- ServiceLocator 提供 Room 数据库

你可以现在在 Android Studio 打开 app/ 目录进行开发。下一步我将实现：
1. CryptoManager 的 AES-GCM 实现与 Android Keystore 封装
2. GitHubBackupClient 的 REST 实现（读取 client_secret 从 local.properties 或 Secrets）
3. 实现事件驱动备份（Room 数据变化监听 -> 触发 encrypt -> pushBackup）

请确认我是否继续把这些更改合并到 dev 并创建 PR 到 main（回复“合并并创建 PR”或“先不要合并”）。
