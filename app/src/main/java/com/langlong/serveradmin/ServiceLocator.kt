package com.langlong.serveradmin

import android.content.Context
import androidx.room.Room
import com.langlong.serveradmin.data.AppDatabase

object ServiceLocator {
    private var db: AppDatabase? = null

    fun provideDatabase(context: Context): AppDatabase {
        return db ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "langlong-db"
            ).build()
            db = instance
            instance
        }
    }
}
