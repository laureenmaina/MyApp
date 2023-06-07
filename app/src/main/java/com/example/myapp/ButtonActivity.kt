package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ButtonActivity : AppCompatActivity() {

    lateinit var intent:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)


        intent=findViewById(R.id.btn4)

        intent.setOnClickListener {
            var int= Intent(this,IntentActivity::class.java)
            startActivity(int)
        }

    }
}