package com.langlong.serveradmin.crypto

import android.content.Context

/**
 * CryptoManager: 高层接口，负责加密/解密、key wrapping、keystore 集成
 */
interface CryptoManager {
    fun initialize(context: Context)
    fun encrypt(plain: ByteArray): EncryptedPackage
    fun decrypt(pkg: EncryptedPackage): ByteArray
}

data class EncryptedPackage(
    val ciphertext: ByteArray,
    val iv: ByteArray,
    val tag: ByteArray,
    val wrappedKeys: Map<String, ByteArray>,
    val metadata: Map<String, String>
)
