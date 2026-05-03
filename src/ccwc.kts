#!/usr/bin/env kotlin

import java.io.File
import kotlin.io.path.Path
import kotlin.io.path.fileSize

if (args.isNotEmpty()) {

    val filename: String = args[args.lastIndex]

    val file = File(filename)

    val filePath = Path(filename)
     val lines = file.readLines()

    when (args[0]) {
        "-c" -> print("${filePath.fileSize()} $filename")
        "-l" -> print("${lines.size} $filename")
    }
}


