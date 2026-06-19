package com.langlong.serveradmin.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "servers")
data class Server(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val host: String,
    val port: Int = 22,
    val username: String,
    val authType: String, // 'password' or 'private_key'
    val passwordRef: String?, // reference to encrypted secret in keystore/local store
    val privateKeyRef: String?,
    val tags: String?,
    val notes: String?,
    val lastModified: Long = System.currentTimeMillis()
)
