package com.example.quizapp.ui.zcustom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import com.example.quizapp.R
import com.example.quizapp.databinding.CustomButtonBinding
import com.example.quizapp.utils.inflate
import com.example.quizapp.utils.loadImage
import com.google.android.material.card.MaterialCardView

class ButtonView (context: Context, attrs: AttributeSet): MaterialCardView(context, attrs) {
    var binding = CustomButtonBinding.bind(inflate(R.layout.custom_button, attachToRoot = true))

    private val attribute = context.obtainStyledAttributes(attrs, R.styleable.ButtonView,0,0)

    init {
        with(attribute){

        }

        binding.imageView.visibility= View.INVISIBLE
        binding.textView4.visibility = View.VISIBLE
        binding.textView4.apply {
            text = attribute.getString(R.styleable.ButtonView_text)
        }

    }

    fun score(isCorrect: Boolean){
        binding.imageView.visibility = View.VISIBLE
        binding.textView4.visibility = View.INVISIBLE
        if (isCorrect){
            binding.imageView.setImageResource(R.drawable.ic_custom_button_check)
        }
        else {
            binding.imageView.setImageResource(R.drawable.ic_custom_button_cancel)
        }
    }

    fun setText(text : String){
        binding.textView4.text = text
    }
}