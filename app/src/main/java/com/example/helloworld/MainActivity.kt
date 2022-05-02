package com.example.helloworld
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get reference to button
        val btnClickMe = findViewById<Button>(R.id.button)
        val textDisplay = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        // get reference to textView
        // set on-click listener
        btnClickMe.setOnClickListener {
            timesClicked += 1
            textDisplay.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }
}