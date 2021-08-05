package com.example.activitylifecycle.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.activitylifecycle.Models.QuestionModel
import com.example.activitylifecycle.R

class MainActivity : AppCompatActivity() {

    private lateinit var myModel : QuestionModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.btnNext)

        //myModel = ViewModelProvider(this).get(QuestionModel::class.java)
        myModel = QuestionModel.getInstance()

        btn.setOnClickListener(){
            var intent : Intent = Intent(this, secondActivity::class.java )

            myModel.name = findViewById<TextView>(R.id.tfName).text.toString()

            startActivity(intent)
        }

    }
}