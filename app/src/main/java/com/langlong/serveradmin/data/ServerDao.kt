package com.langlong.serveradmin.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ServerDao {
    @Query("SELECT * FROM servers ORDER BY lastModified DESC")
    suspend fun getAll(): List<Server>

    @Insert
    suspend fun insert(server: Server): Long

    @Update
    suspend fun update(server: Server)

    @Query("DELETE FROM servers WHERE id = :id")
    suspend fun deleteById(id: Long)
}
