#!/usr/bin/env kotlin

import java.io.File

if (args.isNotEmpty()) {


        if (args[0].startsWith("-")) {
            println("test")
        }


    val filename : String = args[args.lastIndex]

    val file = File(filename)




}


