package xyz.surko.studyhilt.analytics

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class AnalyticsModule {
    @Binds
    abstract fun bindAnalyticsService(
        analyticsServiceImpl: AnalyticsServiceImpl // 参数会告知 Hilt 要提供哪种实现
    ): AnalyticsService // 返回类型会告知 Hilt 函数提供哪个接口的实例
}