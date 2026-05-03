#!/usr/bin/env kotlin

import java.io.File
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
    return lines.sumOf {it.split(("\\s+".toRegex())).filter { it != "" }.size}
}

fun printOutput(output : String, filename : String,) {
    println("$output $filename")
}


