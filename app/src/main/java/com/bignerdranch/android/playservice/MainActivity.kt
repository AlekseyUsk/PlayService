package com.bignerdranch.android.playservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart: Button = findViewById(R.id.button_start)
        val buttonStop: Button = findViewById(R.id.button_stop)

        //запуск service
        buttonStart.setOnClickListener(){
            //явный вызов
            startService(Intent(this,MyService::class.java))
        }

        //остановка service
        buttonStop.setOnClickListener(){
            stopService(Intent(this,MyService::class.java))
        }
    }
}