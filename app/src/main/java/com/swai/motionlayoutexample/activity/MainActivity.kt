package com.swai.motionlayoutexample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.swai.motionlayoutexample.R
import com.swai.motionlayoutexample.adapter.FoodAdapter
import com.swai.motionlayoutexample.model.foodDummyData

class MainActivity : AppCompatActivity() {
    private var foodAdapter: FoodAdapter = FoodAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMain.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        rvMain.adapter = FoodAdapter
        foodAdapter.addAll(foodDummyData)
    }
}