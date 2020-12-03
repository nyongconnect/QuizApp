package com.example.quizapp.ui.zcustom

import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.ui.zcustom.ViewHolder.ViewHolder
import com.example.quizapp.utils.inflate

abstract class RecyclerViewAdapter<T>(diffUtil: DiffUtil.ItemCallback<T>)
    :ListAdapter<T, ViewHolder<T>>(diffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder<T> {
     return  getViewHolder(parent.inflate(viewType), this)
    }

    abstract fun getViewHolder(
        view: View,
        recyclerViewAdapter: RecyclerViewAdapter<T>
        ): ViewHolder<T>

    override fun onBindViewHolder(holder: ViewHolder<T>, position: Int) {
        holder.bind(getItem(position))
    }

    @LayoutRes
    abstract fun getLayoutRes(model: T):Int

    override fun getItemViewType(position: Int): Int = getLayoutRes(getItem(position))
}