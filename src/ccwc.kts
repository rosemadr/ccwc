#!/usr/bin/env kotlin

import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.Path
import kotlin.io.path.fileSize

if (args.isNotEmpty()) {

    val filename : String = args[args.lastIndex]
    val file = File(filename)

    val filePath = Path(filename)
    val lines = file.readLines()

    when (args[0]) {
        "-c" -> printOutput(filePath.fileSize().toString(), filename)
        "-l" -> printOutput(lines.size.toString() ,filename)
        "-w" -> printOutput(findWordCount(lines).toString(), filename)
        else -> print("invalid argument modifier")
    }
}

fun findWordCount(lines: List<String>) : Int {
    //doesn't work, I think because whitespace strings are counted as words
    // remove new lines,
//    val filteredAnSplit = lines.filter { it != "" }.filterNot { is } }
//    print(filteredAnSplit)
//    return filteredAnSplit.sumOf {it.split(" ").trim().size}
    return lines.filter { it != ""}.sumOf {it.split(" ").size}
}

fun printOutput(output : String, filename : String,) {
    println("$output $filename")
}


