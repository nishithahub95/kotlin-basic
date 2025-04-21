package com.example.firstkotlinprogram

fun main(args: Array<String>) {
    var age= ArrayList<Int>()//int ArrayList we can not specify element at the beginning
    //two methods to add element
    age.add(5)
    age.add(1,10)
    println("age=" +age)
    println(age.size)
    var name= arrayListOf<String>("Saam","Raam")
    name.add("Nishitha")
    println("Name array is:${name}")

    //Array with multiple data types
    var newArray=ArrayList<Any>()
    newArray.add("Alvin")
    newArray.add(25)
    newArray.add('a')
    newArray.add(5.5)
    println(newArray)


}