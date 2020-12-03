package com.example.quizapp.ui.zcustom.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class ViewHolder<T>(view:View) : RecyclerView.ViewHolder(view) {

    abstract fun bind(element: T)

}
