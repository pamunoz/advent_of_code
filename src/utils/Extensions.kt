package utils

import java.io.File

val File.text
    get() = this.inputStream().bufferedReader().use { it.readText() }