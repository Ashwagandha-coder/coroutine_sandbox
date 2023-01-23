package Coroutine

import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume

class BaseSample {

    private val param: Int = 0

    private lateinit var continuation: Continuation<Any>


    suspend fun getSome() {

        val result = getSame()

    }

    suspend fun getSame() {

        val result = herOOP(5)
    }

    private fun herOOP(param: Int): Int {

        return param * 2

    }

    /**
     Данный метод принимает continuation Интерфейс - который неявно принимают все suspend функции
     В нем есть открытый api - это 2 методы и одно поле = context , resume, resumeWith
     */


    fun testContinuations(continuation: Continuation<Any>) {

        continuation.context
        continuation.resume(Any())
//        continuation.resumeWith(Any)

    }



    fun testDispatchers() {

        val a = Dispatchers.IO
        val b = Dispatchers.Main
        val c = Dispatchers.Default
        val d = Dispatchers.Unconfined

    }


}