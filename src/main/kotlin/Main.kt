import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Job
import kotlinx.coroutines.coroutineScope
import kotlin.coroutines.coroutineContext

fun main() {

    println("Hello World!")

    val result = doSome { a, b -> a + b }

    println(result)


}


inline fun doSome( lambda: (a: Int, b: Int) -> Int): Int = lambda.invoke(2,2)










suspend fun getMovie() {}
suspend fun getList() {}
suspend fun getSome() {}