package com.string.practice

class PracticeTwo {
    var s="sai preetham reddy"
}
fun main() {
    val obj=PracticeTwo()
    hello(obj)
    println("This is from main method calling ${obj.s}")
}
fun hello(obj : PracticeTwo) {
    println("This is from hello method calling ${obj.s}")
}