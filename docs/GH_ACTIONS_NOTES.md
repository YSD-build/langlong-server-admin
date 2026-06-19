# Optional GitHub Actions templates

我没有把 actions 启用在仓库中（你选择暂不提交 CI 工作流）。如果你未来需要，我会把以下两个模板放入 .github/workflows/：

1) build-and-release.yml — 在 push 时构建 Android 项目并发布到 Releases
2) backup-ci.yml — 用 CI 校验/聚合备份并（可选）将备份推到另一个存储

说明：这些模板会要求在仓库 Secrets 中设置敏感信息（例如 GITHUB_TOKEN 或第三方 API keys）。
