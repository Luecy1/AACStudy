package com.example.aacstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("onCreate: ${lifecycle.currentState.name}")
    }

    override fun onStart() {
        super.onStart()
        println("onStart: ${lifecycle.currentState.name}")
    }

    override fun onResume() {
        super.onResume()
        println("onResume: ${lifecycle.currentState.name}")
    }

    override fun onPause() {
        super.onPause()
        println("onPause: ${lifecycle.currentState.name}")
    }

    override fun onStop() {
        super.onStop()
        println("onStop: ${lifecycle.currentState.name}")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy ${lifecycle.currentState.name}")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart ${lifecycle.currentState.name}")
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        println("onSaveInstanceState ${lifecycle.currentState.name}")
    }
}
