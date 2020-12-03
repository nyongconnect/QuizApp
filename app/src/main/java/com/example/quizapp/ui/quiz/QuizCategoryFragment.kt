package com.example.quizapp.ui.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.quizapp.R
import com.example.quizapp.databinding.FragmentQuizCategoryBinding
import com.example.quizapp.ui.zbase.BaseFragment

class QuizCategoryFragment : BaseFragment() {
lateinit var binding: FragmentQuizCategoryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuizCategoryBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}