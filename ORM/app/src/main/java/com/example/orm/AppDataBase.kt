package com.example.orm

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Contact::class), version = 1)
abstract class AppDataBase :RoomDatabase() {
abstract fun GetDao():ContactDao
//Patron singleton
companion object{
    private var INSTANCE:AppDataBase?=null
    fun GetInstance(context: Context):AppDataBase{
       if (INSTANCE==null){
            INSTANCE=Room.databaseBuilder(context,AppDataBase::class.java,"contact.db").allowMainThreadQueries().build()
           }
          return INSTANCE as AppDataBase
    }
}
}