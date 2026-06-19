package com.langlong.serveradmin.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Server::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun serverDao(): ServerDao
}
