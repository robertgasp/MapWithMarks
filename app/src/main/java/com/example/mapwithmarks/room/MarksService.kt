package com.example.mapwithmarks.room

class MarksService(private val marksDao: MarksDao) {

    fun getAllMarks():List<MarksEntity> = marksDao.all()

    fun insertMark(marksEntity: MarksEntity){
        marksDao.insert(marksEntity)
    }

    fun getMarkById(id:Long):MarksEntity = marksDao.getById(id)

}