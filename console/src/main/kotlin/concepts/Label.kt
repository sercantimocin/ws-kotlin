package concepts

fun main(){

    //breakLoop()
    //returnInForeach()
    //returnInForeachWithLoop()
    //returnInAnonymous()



}

fun breakLoop(){
    loop@for (i in 1..2) {
        for (j in 1..100) {
            println(i)
            break@loop
        }
    }
}

fun returnInForeach() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return
        print(it)
    }
    println("this point is unreachable")
}

fun returnInForeachWithLoop() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit
        print(it)
    }
    print(" done with explicit label")
}

fun returnInAnonymous() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return
        print(value)
    })
    print(" done with anonymous function")
}
