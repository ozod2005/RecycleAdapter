package com.example.recycleadapter

import java.io.Serializable

data class course(
    var course_name:String?=null,
    var image:Int,
    var url:String
): Serializable
