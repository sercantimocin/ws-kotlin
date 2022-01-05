package concepts

fun main() {

    //All nullable references to a are actually the same object because of the memory optimization
    // that JVM applies to Integers between -128 and 127.
    // It doesn't apply to the b references, so they are different objects.
    //referenceCheck()

    //primitiveTypes()

    //typeCheck(11)
    //typeCheck("Test")
}

fun referenceCheck() {
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA) //?
    println(boxedB === anotherBoxedB) //?
}

fun primitiveTypes(){

    val one = 1
    val threeBillion = 3000000000
    val oneLong = 1L
    val oneByte: Byte = 1
    val e = 2.7182818284
    val x = 2.7182818284f
    val y=0b00001011
    val z=0x0F

    println(one::class)
    println(threeBillion::class)
    println(oneLong::class)
    println(e::class)
    println(x::class)
    println(y::class)
    println(z::class)
}

fun typeCheck(x: Any){

    if (x !is Boolean){
        println("x is not boolean")
    }

    if (x is String) {
        println(x.length) // x is automatically cast to String
    }

    val castedX2 = x as? Double
    println(castedX2)

    val castedX = x as Double
    println(castedX)
}