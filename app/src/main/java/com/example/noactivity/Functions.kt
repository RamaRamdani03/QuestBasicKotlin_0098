package com.example.noactivity

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World!")
}

fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

//named argument
//named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgumnet(name: String, age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}