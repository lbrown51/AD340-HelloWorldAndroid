package com.learnkotlin.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val licenseText = intent.getStringExtra(EXTRA_LICENSE)
        val carColorText = intent.getStringExtra(EXTRA_CAR_COLOR)
        val spotNumberText = intent.getStringExtra(EXTRA_SPOT_NUMBER)

        println(spotNumberText)

        val license = findViewById<TextView>(R.id.license_text).apply {
            text = "License: $licenseText"
        }

        val carColor = findViewById<TextView>(R.id.car_color_text).apply {
            text = "Car Color: $carColorText"
        }

        val spotNumber = findViewById<TextView>(R.id.spot_number_text).apply {
            text = "Spot Number: $spotNumberText"
        }

    }
}
