# OAuth App fields for registration

请在 GitHub 控制台中 Register a new OAuth App，并使用以下字段（复制粘贴）：

- Application name: LangLong Server Administration
- Homepage URL: https://github.com/YSD-build/langlong-server-admin
- Authorization callback URL: com.langlong.serveradmin://oauth

Recommended scopes (least privilege required for backups):
- repo (full control of private repositories) — 用于创建/更新备份文件
- user:email — 用于获取用户邮箱（可选）

说明：注册完成后会得到 client_id 和 client_secret。请把 client_id/client_secret 安全地提供给 app（或在 CI/Secrets 中配置）。
