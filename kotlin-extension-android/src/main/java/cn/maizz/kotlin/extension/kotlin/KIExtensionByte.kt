package cn.maizz.kotlin.extension.kotlin

interface KIExtensionByte {
    fun Byte.setBitValue(value: Byte, position: Int): Byte {return ((value.toInt() shl   position) or this.toInt()).toByte() }
}
