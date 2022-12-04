package com.groupeclementine.praticapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.groupeclementine.praticapp.R
import com.groupeclementine.praticapp.R.font

val SabinFont = FontFamily(
    Font(
        R.font.cabin_regular, FontWeight.Normal
    ),
    Font(R.font.cabin_bold, FontWeight.Bold)
)
val SacreFont = FontFamily(Font(R.font.sacramento_regular))

// Set of Material typography styles to start with
//val samaFontFamily = FontFamily(Font())
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    //Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),

    //
    titleMedium = TextStyle(
        fontFamily = SabinFont,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = SabinFont,
        fontWeight = FontWeight.Normal,
        fontSize = 8.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = SacreFont,
        fontWeight = FontWeight.Normal,
        fontSize = 8.sp,
    ),
/*
labelSmall = TextStyle(
fontFamily = FontFamily.Default,
fontWeight = FontWeight.Medium,
fontSize = 11.sp,
lineHeight = 16.sp,
letterSpacing = 0.5.sp
)
*/
)