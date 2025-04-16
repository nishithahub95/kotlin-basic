package com.example.firstkotlinprogram

fun main(args: Array<String>) {
    var age= arrayOf(1,2,3,4)
    println("first element is="+age[0])
    println("second element is="+age.get(1))


    /*
    output:-
    first element is=1
second element is=2*/
    age.set(2,5)
    println("third element is="+age[2])

    //third element is=5
    println("Size of array is="+age.size)
//Size of array is=4
    //array can have different data types
    var ageNName= arrayOf("ann",10,"saam",15)
    println("first element is="+ageNName[0])
    println("second element is="+ageNName.get(1))
    /*first element is=ann
second element is=10*/
}