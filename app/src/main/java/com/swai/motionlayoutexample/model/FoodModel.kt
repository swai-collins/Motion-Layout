package com.swai.motionlayoutexample.model

import com.swai.motionlayoutexample.R

data class FoodModel (
        val title: String,
        val description: String,
        val calories: String,
        val rate: String,
        val imgId: Int)

val foodDummyData: ArrayList<FoodModel> = arrayListOf(
        FoodModel(
                "Salmon Salad",
                "One of the easiest equations for a wholesome meal is vegetables + salmon. Both are packed with nutrients like protein, healthy fats, and fiber that just make you feel good with every single bite, and this simple recipe is proof",
                "80 cal",
                "4.5 rating",
                R.drawable.img_salmon_salad
        ),
        FoodModel(
                "BBQ Chicken Breast",
                "One of the easiest equations for a wholesome meal is vegetables + salmon. Both are packed with nutrients like protein, healthy fats, and fiber that just make you feel good with every single bite, and this simple recipe is proof",
                "80cal",
                "4.5 rating",
                R.drawable.img_chicken
        ),
        FoodModel(
                "Steamed Chicken and Rice",
                "Steaming is an ideal method for cooking boneless chicken breasts and small whole birds such as Cornish hens. It retains the flavor, tenderness and moisture through the use of steam. It is a healthy method of cooking because no additional fat is used.",
                "80cal",
                "4.5 rating",
                R.drawable.img_chicken_rice
        ),
        FoodModel(
                "Caesar Salad",
                "A green salad of romaine lettuce and croutons dressed with lemon juice (or lime juice), olive oil, egg, Worcestershire sauce, anchovies, garlic, Dijon mustard, Parmesan cheese, and black pepper.",
                "80cal",
                "4.5 rating",
                R.drawable.img_salad
        ),
        FoodModel(
                "Wholesome Meal",
                "One of the easiest equations for a wholesome meal is vegetables + salmon. Both are packed with nutrients like protein, healthy fats, and fiber that just make you feel good with every single bite, and this simple recipe is proof",
                "80cal",
                "4.5 rating",
                R.drawable.img_healthy
        )
)