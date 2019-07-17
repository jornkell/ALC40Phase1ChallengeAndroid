package com.example.alc40phase1challenge_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        btn_start_new_activity.setOnClickListener {
            val alcIntent = Intent(this, AboutAlc::class.java)
            // start your next activity
            startActivity(alcIntent)
        }




        btnProfile.setOnClickListener {
            val profileIntent = Intent(this, myprofile::class.java)
            // start your next activity
            startActivity(profileIntent)
        }

    }
}