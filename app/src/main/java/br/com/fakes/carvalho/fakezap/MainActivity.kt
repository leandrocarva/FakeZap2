package br.com.fakes.carvalho.fakezap

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.iid.FirebaseInstanceId
import com.orhanobut.hawk.Hawk

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Hawk.put("TOKENFIREBASE", FirebaseInstanceId.getInstance().token)
    }
}
