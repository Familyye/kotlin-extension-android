/*
 * Copyright 2018 Sollyu，Wonium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.maizz.kotlin.extension.android.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import cn.maizz.kotlin.extension.KIExtension
import cn.maizz.kotlin.extension.TestByte
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity(), KIExtension {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            var byte:Byte=0
        tv.text=byte.setBitValue(1,1).toString()
        byte=byte.setBitValue(1,1)

        Log.d("----------",TestByte.byteToBit(byte.setBitValue(1,0)))
//        edEditText.onImeActionDone { textView, actionId, keyEvent ->
//            Log.d("====", "Done")
//            return@onImeActionDone true
//        }
    }

    fun onButtonClickTest(view: View) {
        edEditText.postDelayed({ edEditText.showSoftInput() }, TimeUnit.SECONDS.toMillis(2))
    }
}
