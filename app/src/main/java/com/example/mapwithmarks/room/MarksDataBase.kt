package com.example.mapwithmarks.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MarksEntity::class], version = 1, exportSchema = false)
abstract class MarksDataBase : RoomDatabase() {
    abstract fun marksDao(): MarksDao
}
