/*
 * Copyright 2018-2019 Sollyu, Wonium
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
 *
 */

package cn.maizz.kotlin.extension.android.sample

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import cn.maizz.kotlin.extension.android.content.*
import org.slf4j.LoggerFactory
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {
    private val logger= LoggerFactory.getLogger(this::class.java)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logger.info("LOG:MainActivity:onCreate:versionName={} ", baseContext.versionName())
        logger.info("LOG:MainActivity:onCreate:versionCode={} ", baseContext.versionCode())
        logger.info("LOG:MainActivity:onCreate:screenWidth={} ", baseContext.getScreenWidth())
        logger.info("LOG:MainActivity:onCreate:screenHeight={} ", baseContext.getScreenHeight())
        logger.info("LOG:MainActivity:onCreate:density={} ", baseContext.getDensity())
    }

}
