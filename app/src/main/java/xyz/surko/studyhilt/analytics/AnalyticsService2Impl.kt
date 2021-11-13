package xyz.surko.studyhilt.analytics

import xyz.surko.studyhilt.loggerE
import javax.inject.Inject

class AnalyticsService2Impl @Inject constructor() : AnalyticsService2 {
    override fun analyticsMethods() {
        loggerE("笑嘻嘻")
    }
}