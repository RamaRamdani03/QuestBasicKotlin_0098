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

//default parameter value
//default parameter value merupakan cara untuk memberikan nilai defatult pada parameter fungsi
fun withDefaultParameter(name: String = " Indra", age: Int) {
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}