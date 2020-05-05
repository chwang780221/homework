package com.train.homework.kotlin

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val BOX_STOP: Int = -1
    var RUN_STATUS = 0
    var length = 0.0f
    var width = 0.0f
    var height = 0

    val Box3 = Box(23f, 14f, 13)
    val Box5 = Box(39.5f, 27.5f, 23)

    while (RUN_STATUS != BOX_STOP) {
        print(" Please enter object's length: ")
        length = scanner.nextFloat()
        if (length.toInt() == BOX_STOP) {
            break
        }
        print(" Please enter object's width: ")
        width = scanner.nextFloat()
        if (width.toInt() == BOX_STOP) {
            break
        }
        print(" Please enter object's height: ")
        height = scanner.nextInt()
        if (height == BOX_STOP) {
            break
        }

        if (Box3.getBox(length, width, height)) {
            print(" Box3 ")
        } else if (Box5.getBox(length, width, height)) {
            print(" Box5")
        }

        println()
        print("Please enter run status (Enter -1 to quit): ")
        RUN_STATUS = scanner.nextInt()
    }
}

class Box (length: Float, width: Float, height: Int) {
    var boxLength = length
    var boxWidth = width
    var boxHeight = height

    fun getBox (length: Float,  width: Float, height: Int): Boolean {
        return ((length <= boxLength) && (width <= boxWidth) && (height <= boxHeight))
    }
}

