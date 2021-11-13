package xyz.surko.studyhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import xyz.surko.studyhilt.analytics.AnalyticsService
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var analyticsService: AnalyticsService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 会输出 AnalyticsServiceImpl 中的 你好啊 三个字，因为 AnalyticsModule.bindAnalyticsService()
        // 中告知了 hilt 要提供 Impl 的实现
        analyticsService.analyticsMethods()
    }
}