package uk.co.jakelee.customactionbar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myBar = supportActionBar!!
        myBar.elevation = 0f
        myBar.setDisplayShowCustomEnabled(true)
        myBar.setCustomView(R.layout.element_toolbar)
        myBar.customView.findViewById<ImageView>(R.id.icon).setOnClickListener {
            // Clicked!
        }
        myBar.setDisplayShowTitleEnabled(false)
    }
}
