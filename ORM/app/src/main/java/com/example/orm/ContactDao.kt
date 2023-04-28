package com.example.orm

import androidx.room.*

@Dao
interface   ContactDao{

@Query("SELECT * FROM Contact")
fun GetAll():List<Contact>


@Insert
fun InsertContact(vararg contact:Contact)

@Delete
fun DeleteContact(vararg contact:Contact)

@Update
fun UpdateContact(vararg contact:Contact)

}