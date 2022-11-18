package com.groupeclementine.praticapp.presentation.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class ClassThem(
    val name: String,
    val classes: Int,
    val imageId: Int,
)

@Composable
fun CoursThemApp() {
    ClassesGrid()
}

@Preview
@Composable
fun ClassPrev() {
    CoursThemApp()
}

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun ClassesGrid() {
    LazyVerticalGrid(cells = GridCells.Adaptive(32.dp)) {


    }
}

@Preview
@Composable
fun ClassCard(classe: ClassThem? = null) {

}