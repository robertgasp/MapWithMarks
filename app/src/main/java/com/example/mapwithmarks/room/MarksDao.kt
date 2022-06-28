package com.example.mapwithmarks.room

import androidx.room.*

@Dao
interface MarksDao {
    @Query("SELECT * FROM MarksEntity")
    fun all(): List<MarksEntity>

    @Query("SELECT * FROM MarksEntity WHERE id=:id")
    fun getById(id: Long): MarksEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(marksEntity: MarksEntity)

    @Delete
    fun delete(marksEntity: MarksEntity)
}