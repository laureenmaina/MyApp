package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FormActivity : AppCompatActivity() {


    //Declare a variable

    lateinit var feedback:Button
    lateinit var pay:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        //finding view by id
        feedback=findViewById(R.id.btn3)
        pay=findViewById(R.id.pay)

        //setOnclicklistener

        feedback.setOnClickListener {
            var feed=Intent(this,ButtonActivity::class.java)
            startActivity(feed)
        }
        pay.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }

    }

}