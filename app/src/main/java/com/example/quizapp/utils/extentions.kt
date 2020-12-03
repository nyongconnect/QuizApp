package com.example.quizapp.utils

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide


fun ViewGroup.inflate(layout: Int,  attachToRoot: Boolean = false): View{
    return LayoutInflater.from(context).inflate(layout, this, attachToRoot)
}

fun ImageView.loadImage(image : Any?){
    Glide.with(context)
        .load(image)
}


fun Activity.launchActivity(intent: Intent, finish : Boolean){
    startActivity(intent)
    if (finish) finish()


}