package com.example.lager.loggerexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.name
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "on create")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login.setOnClickListener {
            val refpd = "ILOVEAND"
            val refel = "user@email.com"

            if(password.text.toString() == refpd && refel == email.text.toString())
                Toast.makeText(this,getString(R.string.Logged_in), Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,getString(R.string.Log_in_attempt), Toast.LENGTH_SHORT).show()

        }

    }

    override fun onStart() {
        Log.d(TAG, "on start")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "on resume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "on pause")
        super.onPause()
    }

    override fun onRestart() {
        Log.d(TAG, "on restart")
        super.onRestart()
    }

    override fun onStop() {
        Log.d(TAG, "on stop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "on destroy")
        super.onDestroy()
    }

}
