package com.pregnantunicorn.goldentitty.models.information

import androidx.fragment.app.FragmentActivity

data class Information(
    val name: String,
    val info: String,
    val icon: () -> Int,
    val buttonText: String,
    val algorithm: (FragmentActivity) -> Unit
)
