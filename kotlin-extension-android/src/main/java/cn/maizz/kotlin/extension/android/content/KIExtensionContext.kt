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

package cn.maizz.kotlin.extension.android.content

import android.annotation.TargetApi
import android.app.usage.UsageStatsManager
import android.content.Context
import android.content.Intent
import android.os.Build
import java.util.concurrent.TimeUnit


interface KIExtensionContext {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP_MR1)
    fun Context.queryUsageStats(intervalType: Int = UsageStatsManager.INTERVAL_BEST, beginTime: Long = System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(10), endTime: Long = System.currentTimeMillis()) =
            (this.getSystemService(Context.USAGE_STATS_SERVICE) as UsageStatsManager).queryUsageStats(intervalType, beginTime, endTime)

    fun Context.launchAppByPackage(packageName: String) = this.startActivity(this.packageManager.getLaunchIntentForPackage(packageName))

    fun Context.gotoUsageAccessSettings() = this.startActivity(Intent("android.settings.USAGE_ACCESS_SETTINGS").apply { this.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) })

    fun Context.installedPackageList() = this.packageManager.getInstalledApplications(0)

    fun Context.isPackageInstalled(packageName: String): Boolean = this.installedPackageList().any { it.packageName == packageName }

}