package com.example.firstkotlinprogram

fun main(args: Array<String>) {
    val ageAndName= mapOf<String,Int>("saam" to 30,"david" to 35)//maps are immutable,should define at the beginning
    println("age of saam =${ageAndName["saam"]}")


//make mutable
    var mutableAgeAndName= mutableMapOf<String,Int>("saam" to 30,"david" to 35)
    mutableAgeAndName.put("Nishitha", 29)
    println("age of Nishitha =${mutableAgeAndName["Nishitha"]}")
    println("age of Nishitha =${mutableAgeAndName.get("Nishitha")}")


}