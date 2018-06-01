package y2015.day2

import utils.inputFromFile

fun main(args: Array<String>) {
    val input: String = inputFromFile(2015, 2)
    println("The answer is: ${answer(input)}")
    println("The second answer: ${answer2(input)}")
}


fun answer(input: String): Long {
    val values = input.replace("\\s+".toRegex(), "*").split("*")
    var result: Long = 0
    values.forEach {
        val (l, w, h) = it.split("x").map { it.toLong() }
        result += paperBoxArea(l, w, h)
    }
    return result
}

fun answer2(input: String): Long {
    val values = input.replace("\\s+".toRegex(), "*").split("*")
    var result: Long = 0
    values.forEach {
        val (l, w, h) = it.split("x").map { it.toLong() }
        result += ribbonLength(l, w, h)
    }
    return result
}

fun paperBoxArea(l: Long, w: Long, h: Long): Long {
    val ordered = listOf(l, w, h).sorted()
    return (2*l*w + 2*w*h + 2*h*l) + (ordered[0] * ordered[1])
}

fun ribbonLength(l: Long, w: Long, h: Long): Long {
    val ordered = listOf(l, w, h).sorted()
    return (2 * ordered[0] + 2 *ordered[1]) + (l * w * h)
}