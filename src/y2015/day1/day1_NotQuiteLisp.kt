package y2015.day1

import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.util.*


fun main(args: Array<String>) {
    readFile()
}

fun readFile() {
    val input: Scanner = Scanner(File("assets/json/inputs.json"))
    val b: StringBuilder = StringBuilder()
    val answer: String = input.nextLine()
    println(answer)
}