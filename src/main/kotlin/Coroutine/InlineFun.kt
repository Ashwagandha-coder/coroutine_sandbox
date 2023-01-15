package Coroutine

inline fun doSome(lambda: (a: Int, b: Int) -> Int): Int = lambda.invoke(2,2)

