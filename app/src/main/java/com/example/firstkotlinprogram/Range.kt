package com.example.firstkotlinprogram

import androidx.core.util.rangeTo

fun main(args: Array<String>) {
    var myCharRange='a'.rangeTo('o')
    var myChar='n' in myCharRange
    println(myChar)

    /*true*/
}