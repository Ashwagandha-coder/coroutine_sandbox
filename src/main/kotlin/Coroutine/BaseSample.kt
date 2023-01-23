package Coroutine

class BaseSample {

    private val param: Int = 0


    suspend fun getSome() {

        val result = getSame()

    }

    suspend fun getSame() {

        val result = herOOP(5)
    }

    private fun herOOP(param: Int): Int {

        return param * 2

    }


}