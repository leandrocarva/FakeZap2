package br.com.fakes.carvalho.fakezap

import android.app.Application
import com.facebook.stetho.Stetho
import com.orhanobut.hawk.Hawk


class MeuApp : Application(){
    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        Hawk.init(this).build()

    }

}