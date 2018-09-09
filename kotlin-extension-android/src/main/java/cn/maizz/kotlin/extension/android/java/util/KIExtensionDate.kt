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

package cn.maizz.kotlin.extension.android.java.util

import android.text.format.DateUtils
import java.text.SimpleDateFormat
import java.util.*

@Suppress("unused", "MemberVisibilityCanBePrivate")
interface KIExtensionDate {

    fun Date.format(format: String = "yyyy-MM-dd HH:mm:ss", locale: Locale = Locale.getDefault()) = SimpleDateFormat(format, locale).format(this)

    fun Date.isToday() = DateUtils.isToday(this.time)

    fun Date.isTomorrow(): Boolean {
        val todayCalendar = Calendar.getInstance().apply { this.add(Calendar.DAY_OF_MONTH, 1) }
        val tomorrowCalendar = Calendar.getInstance().apply { this.timeInMillis = this@isTomorrow.time }
        return (todayCalendar.get(Calendar.YEAR) == tomorrowCalendar.get(Calendar.YEAR) && todayCalendar.get(Calendar.MONTH) == tomorrowCalendar.get(Calendar.MONTH) && todayCalendar.get(Calendar.DAY_OF_MONTH) == tomorrowCalendar.get(Calendar.DAY_OF_MONTH))
    }

}