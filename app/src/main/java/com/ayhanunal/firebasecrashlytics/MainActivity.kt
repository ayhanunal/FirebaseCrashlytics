package com.ayhanunal.firebasecrashlytics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        create_button.setOnClickListener {
            throw RuntimeException("Crash") // Force a crash
        }

        division_zero_error.setOnClickListener {
            var result = 1/0
        }


    }
}