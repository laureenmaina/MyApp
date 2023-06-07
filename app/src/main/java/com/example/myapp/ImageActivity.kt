package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class ImageActivity : AppCompatActivity() {

    lateinit var jeep:ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        jeep=findViewById(R.id.im2)

        jeep.setOnClickListener {
            val car=Intent(this,JeepActivity::class.java)
            startActivity(car)
        }


        }

    }
