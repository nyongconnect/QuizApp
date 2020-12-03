package com.example.quizapp.ui.zbase

import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

open class BaseFragment: Fragment() {



    fun navigate(navDirection: NavDirections) {
        findNavController().navigate(navDirection)
    }
    fun navigate(resId: Int) {
        findNavController().navigate(resId)
    }
}