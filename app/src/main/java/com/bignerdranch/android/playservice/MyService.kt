package com.bignerdranch.android.playservice

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.widget.Toast

class MyService : Service() {

    private lateinit var mPlayer : MediaPlayer

    override fun onCreate() {
        super.onCreate()
        Toast.makeText(this,"Service создан",Toast.LENGTH_SHORT).show()
        mPlayer = MediaPlayer.create(this,R.raw.five)
        mPlayer.isLooping = false
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this,"Service запущен",Toast.LENGTH_SHORT).show()
        mPlayer.start()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        Toast.makeText(this,"Service остановлен",Toast.LENGTH_SHORT).show()
        mPlayer.stop()
        super.onDestroy()
    }

    //метод для связи с другими приложениями и тп
    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
}