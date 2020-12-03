package com.example.quizapp.ui.onboarding

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.R

class OnBoardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
    }



    companion object{


        fun intent(context: Context): Intent {
            return Intent(context, OnBoardingActivity::class.java)
        }
    }
}