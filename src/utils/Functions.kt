package utils

import org.json.simple.JSONArray
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser
import java.io.File
import java.io.FileReader

object Constants {
    val FILE_INPUTS_PATH = "assets/json/inputs.json"
}

fun readJsonFile() {
    val parser: JSONParser = JSONParser()
    val array: JSONArray = parser.parse(FileReader(Constants.FILE_INPUTS_PATH)) as JSONArray
    array.forEach {
        val puzzle: JSONObject = it as JSONObject
        val year: Int = puzzle.get("year") as Int
        val day: Int = puzzle.get("day") as Int
        val inputs: JSONArray = puzzle.get("inputs") as JSONArray
        val input: String = inputs[0] as String
    }
}

data class Puzzle(val year: Int, val day: Int, val inputs: Any)
