package com.langlong.serveradmin.sync

import android.content.Context

/**
 * GitHubBackupClient: 占位实现，后续会实现使用 OAuth token 将加密备份 commit 到用户仓库 backups/ 目录
 */
class GitHubBackupClient(private val context: Context) {
    private val clientId: String = "Ov23liAjGYZW6ba0FyOX" // client_id 放在非敏感处

    fun initialize() {
        // TODO: read client_secret from secure storage/CI secrets/local.properties
    }

    suspend fun pushBackup(fileName: String, encryptedData: ByteArray) {
        // TODO: implement commit via GitHub REST API: PUT /repos/{owner}/{repo}/contents/{path}
    }
}
