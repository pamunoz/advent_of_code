package utils

import java.io.File

fun inputFromFile(year: Int, day: Int) = File("assets/inputs/$year/$day").text


