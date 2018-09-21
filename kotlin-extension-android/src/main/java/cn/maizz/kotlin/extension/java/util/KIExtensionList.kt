package cn.maizz.kotlin.extension.java.util

import java.util.*

interface KIExtensionList {

    fun <E> List<E>.random(): E? = get(Random(System.currentTimeMillis()).nextInt(size))

}