package y2015.day1

import utils.inputFromFile


fun main(args: Array<String>) {
    val input = inputFromFile(2015, 1)
    println("First Answer: ${firstAnswer(input)}")
    println("Second Answer: ${secondAnswer(input)}")
}

fun firstAnswer(input: String): Int {
    var anwer = 0
    input.forEach {
        if (it == '(') {
            anwer++
        } else {
            anwer--
        }
    }
    return anwer
}

fun secondAnswer(input: String): Int {
    var answer = 0
    var floor = 0
    input.forEach {
        answer++
        if (it == '(') {
            floor++
            if (floor < 0) return answer
        } else {
            floor--
            if (floor < 0) return answer
        }
    }
    return answer
}

