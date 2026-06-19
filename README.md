# LangLong Server Administration

这是 LangLong Server Administration 的初始仓库骨架（MVP 项目初始提交）。

目标：原生 Android（Kotlin + Jetpack Compose）客户端，用于管理远程服务器（SSH 终端、凭证管理、脚本模板、SFTP、性能监控），支持可选登录并把加密备份同步到 GitHub（public repo）。

当前提交包含：
- docs/：架构、OAuth 与加密说明
- app/：Android 项目骨架占位（README 与基础文件），用于在 Android Studio 中展开开发
- .gitignore：Android 常用忽略规则

下一步：
1. 在本地打开 app/ 目录并用 Android Studio 导入项目（按 docs 中说明填写 OAuth client_id/secret）
2. 我将根据 repo 继续提交具体模块（Room/crypto/sshj/sync/Compose UI）实现

如果你希望我接着在此仓库中创建分支并提交代码，请告诉我优先实现的子任务（例如：本地加密备份实现、OAuth 登录、或 SSH 终端）。
