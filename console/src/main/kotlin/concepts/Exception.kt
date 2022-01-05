package concepts

import java.lang.StringBuilder

fun main() {

    tryCatchReturnVariable()

    //usingJavaFuncWithCheckedException()
}

private fun tryCatchReturnVariable() {
    var input = readLine()

    val a: Int? = try {
        input?.toInt()
    } catch (e: NumberFormatException) {
        null
    }

    println(a)
}

private fun usingJavaFuncWithCheckedException() {
    var str = StringBuilder()
    str.append("abc", 1, 2);
    println(str)
}