package com.example.quizapp.ui.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.R
import com.example.quizapp.databinding.ActivityLoginBinding
import com.example.quizapp.databinding.ActivityMainBinding
import com.example.quizapp.ui.MainActivity
import com.example.quizapp.utils.PreferenceHelper
import com.example.quizapp.utils.launchActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
    private var isValidUser: Boolean = false
    private var isUserInputValid: Boolean = false
    lateinit var binding: ActivityLoginBinding

    @Inject
    lateinit var preferenceHelper: PreferenceHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnLogin.setOnClickListener{
            val email = getEmailFromUser()
            val password = getPasswordFromUser()
            validateUserInput(email, password)
            if (isUserInputValid) authenticateUser(email, password)

        }
    }

    private fun getEmailFromUser(): String{
        return binding.edtUserEmail.text.toString()
    }
    private fun getPasswordFromUser(): String {
        return binding.edtUserPassword.text.toString()
    }
    private fun authenticateUser(email: String, password: String) {
        launchActivity(MainActivity.intent(this),true)
        preferenceHelper.isLoggedIn = true
    }

    private fun validateUserInput(email: String, password: String) {
        when {
            email.isNullOrEmpty() -> {
                binding.edtUserEmail.error = "Provide email"
            }
            password.isNullOrEmpty() -> {
                binding.edtUserPassword.error = "Missing field"
            }
            else -> {
                isUserInputValid = true
            }
        }
    }

    companion object{
        fun intent(context: Context): Intent {
            return Intent(context, LoginActivity::class.java)
        }
    }
}