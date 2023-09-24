package com.codengineassessment

import android.app.Activity
import android.app.Application
import android.content.ComponentCallbacks2
import android.content.Context
import android.os.Bundle
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.repository.GenerateDogRepository
import com.codengineassessment.ui.viewmodelfactory.MainViewModelFactory
import com.codengineassessment.network.NetworkConnectionInterceptor
import com.codengineassessment.network.NetworkModule
import com.codengineassessment.ui.viewmodelfactory.LoginViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class CodengineAssessment :
    Application(),
    KodeinAware,
    Application.ActivityLifecycleCallbacks,
    ComponentCallbacks2 {

    operator fun get(context: Context): CodengineAssessment {
        return context.applicationContext as CodengineAssessment
    }

    companion object {

        private lateinit var application: CodengineAssessment
        @JvmStatic
        fun getInstance(): CodengineAssessment {
            return application
        }

    }

    override fun onCreate() {
        super.onCreate()
    }

    override val kodein = Kodein.lazy {
        import(androidXModule(this@CodengineAssessment))
        bind() from singleton { NetworkConnectionInterceptor(instance()) }
        bind() from singleton { PreferenceProvider(instance()) }
        bind() from provider { GenerateDogRepository(NetworkModule.formService) }
        bind() from provider { MainViewModelFactory() }
        bind() from provider { LoginViewModelFactory() }
    }

    override fun onActivityCreated(p0: Activity, p1: Bundle?) {
        TODO("Not yet implemented")
    }

    override fun onActivityStarted(p0: Activity) {
        TODO("Not yet implemented")
    }

    override fun onActivityResumed(p0: Activity) {
        TODO("Not yet implemented")
    }

    override fun onActivityPaused(p0: Activity) {
        TODO("Not yet implemented")
    }

    override fun onActivityStopped(p0: Activity) {
        TODO("Not yet implemented")
    }

    override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
        TODO("Not yet implemented")
    }

    override fun onActivityDestroyed(p0: Activity) {
        TODO("Not yet implemented")
    }
}