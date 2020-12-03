package com.example.quizapp.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.quizapp.R
import com.example.quizapp.databinding.ActivityMainBinding

lateinit var navController: NavController
lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.materialToolbar)

        navController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.quizCategoryFragment,
                R.id.scoreFragment,
                R.id.navActionSettings,
                R.id.profileFragment
            )
        )

        setupActionBarWithNavController(navController,  appBarConfiguration)
        binding.bottomNavigationView.setupWithNavController(navController)
        initDestinationListener()



    }


    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    fun initDestinationListener(){
        navController.addOnDestinationChangedListener{_, destination,_ ->
            when(destination.id){
               //.id.quizCategoryFragment, R.id.profileFragment, R.id.scoreFragment -> binding.materialToolbar.elevation = 8f
            }


        }

    }
    companion object{
        fun intent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)



        }
    }
}