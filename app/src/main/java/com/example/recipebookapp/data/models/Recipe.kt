package com.example.recipebookapp.data.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recipe(
    val id: Int, // unique identifier for the recipe
    val title: String, // recipe title (e.g., Chocolate Cake)
    val ingredients: List<String>, // list of ingredients (e.g., flour, sugar, etc.)
    @DrawableRes val imageUrl: Int, // image of the recipe
    @StringRes val categoryName: Int
)
