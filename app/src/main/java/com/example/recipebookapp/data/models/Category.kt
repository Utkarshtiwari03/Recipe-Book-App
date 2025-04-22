package com.example.recipebookapp.data.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Category(
    val id: Int,
    @StringRes val stringResourceId:Int,
    @DrawableRes val imageResourceId:Int,
)
