# 项目架构说明

核心模块：
- app/: Android 应用代码（Jetpack Compose + Kotlin）
- modules/crypto/: 加密模块（AES-GCM、Key wrapping、Keystore 接口）
- modules/ssh/: SSH 与 SFTP 支持（sshj 绑定的接口）
- modules/sync/: 同步模块（把加密备份 push 到 GitHub backups/ 目录）
- docs/: 文档与操作指南

MVP 优先级（首版）：
1. 本地 CRUD（Room） + 本地加密备份
2. OAuth 登录（GitHub）并把加密备份提交到用户仓库
3. SSH 终端与 SFTP（sshj）
4. 脚本模板与性能监控

我会以小步快跑方式提交：每个功能分支/PR 包含可运行的单元与 README 示例。
