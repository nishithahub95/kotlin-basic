package com.example.firstkotlinprogram

fun main(args: Array<String>) {
    print("What is your name?")
    var name:String?= readLine()
    print("How old are you?" )
    var age:Int= readLine()!!.toInt()//type conversion is used because the input from the user is string
    println("your name is $name and age is $age")
    /*What is your name?Nishitha
How old are you?29
your name is Nishitha and age is 29*/
}