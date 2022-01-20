package com.sangyan.pass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun viewName(view: View) {
   val user_name = name.editableText.toString()
        val intent = Intent(this,NameActivity::class.java)
         intent.putExtra(NameActivity.PASS,user_name)
        startActivity(intent)
    }
}