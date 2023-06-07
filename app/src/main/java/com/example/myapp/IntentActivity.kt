package com.example.myapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast

class IntentActivity : AppCompatActivity() {

    //Declaring variables
    lateinit var sms: Button
    lateinit var email: Button
    lateinit var share: Button
    lateinit var camera: Button
    lateinit var stk: Button
    lateinit var call: Button
    lateinit var next:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        //Finding view by id
        sms = findViewById(R.id.BtnSms)
        email = findViewById(R.id.BtnEmail)
        share = findViewById(R.id.BtnShare)
        camera = findViewById(R.id.BtnCamera)
        stk = findViewById(R.id.BtnStk)
        call = findViewById(R.id.BtnCall)
        next = findViewById(R.id.btnnext)


        //Intent
        //sms
        sms.setOnClickListener {
            val uri = Uri.parse("smsto:0746411462")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "Hey Laurine...")
            startActivity(intent)
        }
        //email
        email.setOnClickListener {
            val emailIntent =
                Intent(
                    Intent.ACTION_SENDTO,
                    Uri.fromParts("mailto", "mainalaureen58@gmail.com", null)
                )
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "JOB APPLICATION")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear Madam...")
            startActivity(Intent.createChooser(emailIntent, "Send email ..."))
        }
//share
        share.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type = "text/plain"
            shareIntent.putExtra(
                Intent.EXTRA_TEXT,
                "https://github.com/laureenmaina?tab=repositories"
            )
            startActivity(shareIntent)
        }
//camera
        camera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent, 1)
        }
        //stk
        stk.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        //call
        call.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel" + "0794255692")
            startActivity(dialIntent)
        }

        //next
        next.setOnClickListener {
            var myinfo = Intent(this, ImageActivity::class.java)
            startActivity(myinfo)
        }


        }
    }








