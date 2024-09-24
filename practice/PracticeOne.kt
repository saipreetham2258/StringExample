package com.string.practice

class PracticeOne {
}
fun main() {
    println("Enter the value of string")
    var s= readln()!!.toString()
    println(s)
    println("character is ${s[2]}")
    println(s.first())
    println(s.last())
    if(s.compareTo("saii")==0){
        println("It is equal")
    }
    else{
        println("It is not equal")
    }
    println(s.contains('s'))
    println(s.length)
    println(s.uppercase())
}