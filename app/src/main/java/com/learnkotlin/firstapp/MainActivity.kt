package com.learnkotlin.firstapp

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText

import kotlinx.android.synthetic.main.activity_main.*

const val EXTRA_LICENSE = "com.example.firstapp.LICENSE"
const val EXTRA_CAR_COLOR = "com.example.firstapp.CAR_COLOR"
const val EXTRA_SPOT_NUMBER = "com.example.firstapp.SPOT_NUMBER"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    /** Called when the user taps the Send button */
    fun park(view: View) {
        println("INSIDE MAIN")
        val changeLicense = findViewById<EditText>(R.id.change_license)
        val license = changeLicense.text.toString()

        val changeCarColor = findViewById<EditText>(R.id.change_car_color)
        val carColor = changeCarColor.text.toString()

        val spotNumber = "1"

        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_LICENSE, license)
            putExtra(EXTRA_CAR_COLOR, carColor)
            putExtra(EXTRA_SPOT_NUMBER, spotNumber)
        }
        startActivity(intent)
    }
}
