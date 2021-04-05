package com.example.genfirstproj

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setContentView(R.layout.second)

        buttonClick.setOnClickListener {

           /* var un = editTextUsername.text.toString()

            Toast.makeText(this,"usename is $un",Toast.LENGTH_LONG).show()

            textViewUsername.setText(un)

            var myIntent = Intent(this,SecondActivity::class.java)

            myIntent.putExtra("key",un)

            startActivity(myIntent)*/

            /*var i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:845045044"))
            startActivity(i)*/

            /*var i = Intent(Intent.ACTION_VIEW,Uri.parse("http://google.com"))
            startActivity(i)*/

            var i = Intent("com.vinyak")
            startActivity(i)

        }

    }
}