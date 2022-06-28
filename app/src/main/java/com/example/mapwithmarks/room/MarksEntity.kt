package com.example.mapwithmarks.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import org.koin.core.definition.indexKey

@Entity(indices = [Index(value = ["id"], unique = true)])
data class MarksEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long,
    @ColumnInfo(name = "long")
    var long: Double,
    @ColumnInfo(name = "lat")
    var lar: Double,
    @ColumnInfo(name = "title")
    var title: String
)