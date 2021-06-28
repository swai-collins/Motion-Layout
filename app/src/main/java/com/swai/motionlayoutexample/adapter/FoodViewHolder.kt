package com.swai.motionlayoutexample.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.swai.motionlayoutexample.model.FoodModel

class FoodViewHolder(private val root:View) : RecyclerView.ViewHolder(root){
    fun bind(food: FoodModel){
        root.tvTitle.text = food.title
        root.tvDescription.text = food.description
        root.tvCalories.text = food.calories
        root.tvRate.text = food.rate
        root.imageFood.setImageResource(food.imgId)
    }
}