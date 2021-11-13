package xyz.surko.studyhilt.analytics

import xyz.surko.studyhilt.loggerE
import javax.inject.Inject

class AnalyticsServiceImpl @Inject constructor() : AnalyticsService {
    override fun analyticsMethods() {
        loggerE("你好啊")
    }
}