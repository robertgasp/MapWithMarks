package com.example.mapwithmarks.application

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mapwithmarks.di.marksModule
import com.example.mapwithmarks.room.MarksDao
import com.example.mapwithmarks.room.MarksDataBase
import org.koin.core.context.startKoin
import java.lang.IllegalStateException

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(marksModule)
        }
        appInstance = this
    }

    companion object {
        private var appInstance: App? = null
        private var db: MarksDataBase? = null
        private const val DB_NAME = "Marks.db"

        fun getMarksDao(): MarksDao {
            if (db==null){
                synchronized(MarksDataBase::class.java){
                    if (db == null){
                        if (appInstance == null){
                            throw IllegalStateException("Application ids null meanwhile creating database")
                        }
                    }
                    db = Room.databaseBuilder(
                        appInstance!!.applicationContext,
                        MarksDataBase::class.java,
                        DB_NAME
                    )
                    .allowMainThreadQueries()
                        .build()

                }
            }
            return db!!.marksDao()
        }
    }
}