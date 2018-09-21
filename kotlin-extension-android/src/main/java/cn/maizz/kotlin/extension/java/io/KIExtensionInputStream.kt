package cn.maizz.kotlin.extension.java.io

import org.apache.commons.io.IOUtils
import java.io.InputStream
import java.nio.charset.Charset

@Suppress("unused")
interface KIExtensionInputStream {

    fun InputStream.toString(encoding: Charset) = IOUtils.toString(this, encoding)!!

    fun InputStream.toByteArray() = IOUtils.toByteArray(this)!!

    fun InputStream.toCharArray(encoding: Charset = Charset.forName("UTF-8")) = IOUtils.toCharArray(this, encoding)!!

    fun InputStream.equal(inputStream: InputStream) = IOUtils.contentEquals(this, inputStream)
}