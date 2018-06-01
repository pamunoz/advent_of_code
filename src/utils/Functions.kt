package utils

import org.json.simple.JSONArray
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser
import java.io.File
import java.io.FileReader

object Constants {
    const val FILE_INPUTS_PATH = "assets/json/inputs.json"
}

fun getInput(puzzleYear: Long, puzzleDay: Long, index: Int): String {
    val parser = JSONParser()
    val array: JSONArray = parser.parse(FileReader(Constants.FILE_INPUTS_PATH)) as JSONArray
    var input = ""
    array.forEach {
        val puzzle: JSONObject = it as JSONObject
        val year: Long = puzzle["year"] as Long
        val day: Long = puzzle["day"] as Long
        val inputs: JSONArray = puzzle["inputs"] as JSONArray
        if (year == puzzleYear && day == puzzleDay) {
            input = inputs[index] as String
        }
    }
    return input
}
