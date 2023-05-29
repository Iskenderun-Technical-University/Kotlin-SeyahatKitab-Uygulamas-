package com.example.kotlin_haritalar

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
class yer(
  @ColumnInfo(name = "name")
  var name : String,
  @ColumnInfo(name = "latitude")
  var latitude : Double,
  @ColumnInfo(name = "longitude")
  var longitude : Double


) : Serializable {
  @PrimaryKey(autoGenerate = true)
   var id = 0
}