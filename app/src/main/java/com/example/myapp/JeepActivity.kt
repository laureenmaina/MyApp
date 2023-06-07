package com.example.myapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class JeepActivity : AppCompatActivity() {
    lateinit var next:Button

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jeep)

          next=findViewById(R.id.btn)


            next.setOnClickListener {
                val simToolKitLaunchIntent =
                    applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { startActivity(it) }
            }
        }
    }
