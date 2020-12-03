package com.example.quizapp.ui.score

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.quizapp.R
import com.example.quizapp.databinding.FragmentScoreBinding

class ScoreFragment : Fragment() {


    private lateinit var binding : FragmentScoreBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     binding = FragmentScoreBinding.inflate(inflater)
        return binding.root
    }
}