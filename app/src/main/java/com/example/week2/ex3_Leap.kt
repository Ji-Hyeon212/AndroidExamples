package com.example.week2

fun Year(number:Int):Int{
    var leap:Int = 1
    if(number%4==0||number%400==0) leap = 0
    else if(number%100==0&&number%400!=0) leap = 1
    return leap
}
fun printer(number:Int){
    if(number == 0) println("윤년이 맞습니다.")
    else if(number ==1) println("윤년 아닙니다.")
}
fun main(){
    println("2000년은 윤년 일까?")
    printer(Year(2000))

    println("1900년은 윤년 일까?")
    printer(Year(1900))

    println("2020년은 윤년 일까?")
    printer(Year(2020))
}