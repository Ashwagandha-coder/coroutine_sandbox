package Coroutine

import Coroutine.doSome

fun main() {

    println("Hello World!")

    val result = doSome { a, b -> a + b }

    println(result)


}



suspend fun getMovie() {}
suspend fun getList() {}
suspend fun getSome() {}