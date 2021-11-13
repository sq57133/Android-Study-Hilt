package xyz.surko.studyhilt.analytics

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object AnalyticsModule2 {
    /**
     * 如果某个类不归自己所有，如 Retrofit、Room...，或必须通过 Build 等方式来构建，那么就可以通过这种方式
     */
    @Provides
    fun provideAnalyticsService(
        // Potential dependencies of this type 此类型的潜在依赖项
        // 参数会告知 Hilt 相应类型的依赖项
    ): AnalyticsService2 { // 返回类型会告知 Hilt 函数提供哪个类型的实例
//        return Retrofit.Builder()
//            .baseUrl("https://example.com")
//            .build()
//            .create(AnalyticsService::class.java)
        return AnalyticsService2Impl() // 未引入 Retrofit 换这种方式演示
        // 主体会告知 Hilt 如何提供相应类型的实例。每当需要提供该类型的实例时，Hilt 都会执行函数主体
    }
}