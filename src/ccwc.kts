#!/usr/bin/env kotlin

import java.io.File
import kotlin.io.path.Path
import kotlin.io.path.fileSize

if (args.isNotEmpty()) {
    if (args[0] == "-c") {
        val filename: String = args[args.lastIndex]

        val file = File(filename)

        val filePath = Path(filename)
        print("${filePath.fileSize()} $filename")
    }
}


