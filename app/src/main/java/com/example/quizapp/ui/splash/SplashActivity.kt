package com.example.quizapp.ui.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.quizapp.R
import com.example.quizapp.ui.MainActivity
import com.example.quizapp.ui.login.LoginActivity
import com.example.quizapp.ui.onboarding.OnBoardingActivity
import com.example.quizapp.utils.PreferenceHelper
import com.example.quizapp.utils.launchActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import javax.inject.Inject

@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {

    @Inject
    lateinit var preferenceHelper: PreferenceHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)



        lifecycleScope.launchWhenCreated {
            delay(2000)
            if (preferenceHelper.isFirstRun){
           launchActivity(OnBoardingActivity.intent(this@SplashActivity), true)
                preferenceHelper.isFirstRun = false
            }else{
                if (!preferenceHelper.isLoggedIn){
                    launchActivity(LoginActivity.intent(this@SplashActivity), true)
                }
                else{
                    launchActivity(MainActivity.intent(this@SplashActivity), true)
                }
            }
        }
    }
}