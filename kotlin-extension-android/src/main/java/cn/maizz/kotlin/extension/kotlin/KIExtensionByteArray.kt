package cn.maizz.kotlin.extension.kotlin

interface KIExtensionByteArray {
    fun ByteArray.toHex() = this.joinToString(separator = "") { it.toInt().and(0xff).toString(16).padStart(2, '0') }
}