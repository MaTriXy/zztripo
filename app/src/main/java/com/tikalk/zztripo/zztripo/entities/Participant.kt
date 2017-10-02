package com.tikalk.zztripo.zztripo.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "participant")
data class Participant(@PrimaryKey var id:Long,
                       var name:String?,
                       var lat:Float,
                       var lng:Float
                       ){
    constructor():this(-1,"",1f,2f)
}