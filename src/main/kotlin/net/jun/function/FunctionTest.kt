package net.jun.function

fun double(number: Int): Int {
    return number * 2
}

fun doubleExp(number: Int) = number * 2

fun printDouble(number: Int):Unit {
    println(number * 2)
}

fun printDoubleExp(number: Int) = println(number * 2)

fun sum(a: Int, b: Int) = a + b

// like java...
fun max(a: Double, b: Double): Double {
    if (a > b) {
        return a
    } else {
        return b
    }
}

// if is expression!
fun max2(a: Double, b: Double): Double {
    return if (a > b) a else b
}

// more shorter...
fun max3(a: Double, b: Double) = if (a > b) a else b

fun main(args: Array<String>) {
    println(double(100))
    println(doubleExp(2300))
    printDouble(123)
    printDoubleExp(345)
    println(sum(34, 56))
    println(max(300.0, 400.0))
    println(max2(6506.0, 4298.0))
    println(max3(335.0, 435.0))
}