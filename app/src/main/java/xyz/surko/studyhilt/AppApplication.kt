package xyz.surko.studyhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// @HiltAndroidApp 使用 hilt 必须，会触发 hilt 代码生成，代码包括应用的一个基类，充当应用级依赖项容器
@HiltAndroidApp
class AppApplication : Application() {
}

/*
    Hilt 目前支持
    Application @HiltAndroidApp
    Activity @AndroidEntryPoint
    Fragment @AndroidEntryPoint
    View
    Service
    BroadcastReceiver

    @AndroidEntryPoint 会为项目中的每个 Android 类生成一个单独的 Hilt 组件。这些组件可以从它们各自的父类接收依赖项

    如果使用 @AndroidEntryPoint 为某个 android 类添加注释，则还必须为依赖于该类的 android 类添加注释，例如
    如果为某个 fragment 添加注释，则其对应的 activity 也要加

    @Inject 从组件获取依赖项
    abstract 不需要 AndroidEntryPoint
 */