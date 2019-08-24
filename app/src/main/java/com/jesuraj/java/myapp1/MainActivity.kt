package com.jesuraj.java.myapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.delay
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{


        }
    }


    private suspend fun getResult1FromApi():String{
        Timber.d("get result from api")
        delay(2000)
        return "Result 1"
    }
}
