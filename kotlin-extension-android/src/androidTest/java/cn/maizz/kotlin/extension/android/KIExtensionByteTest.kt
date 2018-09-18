package cn.maizz.kotlin.extension.android

import android.support.test.runner.AndroidJUnit4
import cn.maizz.kotlin.extension.kotlin.KIExtensionByte
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class KIExtensionByteTest:KIExtensionByte {

    @Test
   fun  testToBit(){
       val byte:Byte=8
       assertEquals(byte.toBit(), "00001000")
   }
}