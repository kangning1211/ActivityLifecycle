package com.example.activitylifecycle.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.activitylifecycle.Models.QuestionModel
import com.example.activitylifecycle.R

class secondActivity : AppCompatActivity() {

    private lateinit var myModel : QuestionModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btn : Button = findViewById(R.id.btnAdd)
        val tvQuestion : TextView = findViewById(R.id.tvQuestion)
        val tvName : TextView = findViewById(R.id.tvName)

        /*if(savedInstanceState != null){
            tvQuestion.text = savedInstanceState.getString("question")

        }*/

        //myModel = QuestionModel()
        //myModel = ViewModelProvider(this).get(QuestionModel::class.java)
        myModel = QuestionModel.getInstance()

        tvQuestion.text = myModel.getQuestion()
        tvName.text = myModel.name


        btn.setOnClickListener(){
            tvQuestion.text = myModel.generateQuestion()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("lifeCycle", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("lifeCycle", "onRestart")
    }


    override fun onPause() {
        super.onPause()
        Log.i("lifeCycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("lifeCycle", "onStop")
    }

    /*override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        var question = findViewById<TextView>(R.id.tvQuestion).text.toString()

        outState.putString("question",question)
    }*/



}