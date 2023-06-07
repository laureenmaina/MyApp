package com.example.myapp

import android.content.Intent
import android.icu.text.IDNA
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //Declare a variable
     lateinit var toast: Button
     lateinit var info:Button
     lateinit var back:Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            //Finding view by ID
            toast = findViewById(R.id.btn1)
            info = findViewById(R.id.btn2)


//SetonClick listener
            toast.setOnClickListener {
                Toast.makeText(applicationContext, "You did it successfully", Toast.LENGTH_LONG)
                    .show()
                }

            info.setOnClickListener {
               Toast.makeText(applicationContext,
                        "Welcome, enter your details ",Toast.LENGTH_LONG)
                    .show()
                var myinfo = Intent(this, FormActivity::class.java)
                startActivity(myinfo)
                }

        }
}
