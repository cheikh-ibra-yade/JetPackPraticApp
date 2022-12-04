package com.groupeclementine.benenmodule.ui.theme.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.groupeclementine.benenmodule.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CoursThemApp() {

    val courses:List<ClassThem> by remember {
        mutableStateOf(getCours())
    }
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        //horizontalArrangement = Arrangement.SpaceEvenly

    ) {
        items(courses.size) {
            ClassCardH(courses.get(it))
        }
    }
}

@Composable
fun ClassCardH(classe: ClassThem, modifier: Modifier = Modifier) {
    Card(
        modifier
            .padding(4.dp)
            .height(80.dp)
    ) {
        Row(Modifier.fillMaxSize(),verticalAlignment = Alignment.CenterVertically) {
            Image(
                modifier = Modifier.fillMaxHeight(),
                painter = painterResource(classe.imageId),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(12.dp))
            TitleAndDescriptionCard(classe.name)
        }
    }
}

@Composable
fun TitleAndDescriptionCard(name: String) {
    Column() {
        Text(name)
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(painter = painterResource(R.drawable.black_berry), contentDescription = "", tint = Color.Black)
            Spacer(modifier = Modifier.width(4.dp))
            Text("123")

        }
    }
}


data class ClassThem(
    val name: String,
    val classes: Int,
    val imageId: Int,
)

@Preview
@Composable
fun AppPrev() {
    CoursThemApp()
}

fun getCours():List<ClassThem> {
    return listOf(
        ClassThem(
            name = "Math",
            classes = 1,
            imageId = R.drawable.architecture
        ),
        ClassThem(
            name = "Math",
            classes = 1,
            imageId = R.drawable.business
        ),
        ClassThem(
            name = "Math",
            classes = 1,
            imageId = R.drawable.crafts
        ),
        ClassThem(
            name = "Math",
            classes = 1,
            imageId = R.drawable.culinary
        ),ClassThem(
            name = "Math",
            classes = 1,
            imageId = R.drawable.design
        ),ClassThem(
            name = "Math",
            classes = 1,
            imageId = R.drawable.drawing
        ),ClassThem(
            name = "Math",
            classes = 1,
            imageId = R.drawable.fashion
        ),ClassThem(
            name = "Math",
            classes = 1,
            imageId = R.drawable.film
        ),ClassThem(
            name = "Math",
            classes = 1,
            imageId = R.drawable.gaming
        ),ClassThem(
            name = "Math",
            classes = 1,
            imageId = R.drawable.lifestyle
        ),ClassThem(
            name = "Math",
            classes = 1,
            imageId = R.drawable.music
        ),
        ClassThem(
            name = "Math",
            classes = 1,
            imageId = R.drawable.painting
        ),
        ClassThem(
            name = "Math",
            classes = 1,
            imageId = R.drawable.photography
        ),
        ClassThem(
            name = "Math",
            classes = 1,
            imageId = R.drawable.tech.minus(3)
        ),








        )
}