package com.example.firstkotlinprogram

fun main(args: Array<String>) {
    print("please enter the day number of week:")
    var dayNumber:Int= readLine()!!.toInt()
    var day:String
    when(dayNumber){
        1->day="monday"
        2->day="Tuesday"
        3->day="WednessDay"
        4->day="Thersday"
        5->day="friday"
        else->day="Invalid"
    }
    println("the day is:$day")
}
/*please enter the day number of week:2
the day is:Tuesday
*/