package com.sangyan.pass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_name.*

class NameActivity : AppCompatActivity() {
               companion object{
                   val PASS = "PASS"
               }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        val name = intent.getStringExtra(PASS)
        my_name.text = "Hi my Name is $name"
    }
}