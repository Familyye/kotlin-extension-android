package cn.maizz.kotlin.extension.kotlin.ranges

import java.util.*

interface KIExtensionClosedRange {

    fun ClosedRange<Int>.random() = Random().nextInt((endInclusive + 1) - start) + start

    fun ClosedRange<Char>.random(length: Int) = (1..length).map { (Random().nextInt(endInclusive.toInt() - start.toInt()) + start.toInt()).toChar() }.joinToString("")

}