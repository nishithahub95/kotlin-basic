package com.example.firstkotlinprogram

fun main(args: Array<String>) {
  /*  for (number in 1..10){
        println(number)
    }
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10*/
    /*var sum:Int=0
    for(number in 1..10){
        if(number%2==0){
            sum+=number
        }
    }
    println("The sum of even number:$sum")
    The sum of even number:30*/

    /*var myArray= arrayOf<Int>(1,2,3,4,5,6,7,8)
    for (x in myArray){
        println(x)
    }
    1
    2
    3
    4
    5
    6
    7
    8*/
/*var myArray= arrayOf<Int>(1,2,3,4,5,6,7,8)
for (x in 0..(myArray.size)-1){
   println("myArray[$x]=${myArray[x]}")
}

    myArray[0]=1
    myArray[1]=2
    myArray[2]=3
    myArray[3]=4
    myArray[4]=5
    myArray[5]=6
    myArray[6]=7
    myArray[7]=8*/

//var myArray= arrayOf<Int>(1,2,3,4,5,6,7,8)
//for (x in myArray.indices){
//println("myArray[$x]=${myArray[x]}")
//}
//
//    myArray[0]=1
//    myArray[1]=2
//    myArray[2]=3
//    myArray[3]=4
//    myArray[4]=5
//    myArray[5]=6
//    myArray[6]=7
//    myArray[7]=8


    //for each
    var myNewArray= arrayOf<Int>(1,2,3,4,5,6,7,8,9,10)
    myNewArray.forEach { println(it) }
}