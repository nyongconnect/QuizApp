package com.example.quizapp.ui.difficulty

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.quizapp.databinding.FragmentDifficultyLevelBinding

class DifficultyLevelFragment : Fragment() {
   private lateinit var binding: FragmentDifficultyLevelBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDifficultyLevelBinding.inflate(inflater)
        return binding.root
    }

}