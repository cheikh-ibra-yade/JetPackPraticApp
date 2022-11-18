package com.groupeclementine.praticapp.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.groupeclementine.praticapp.R

@Preview(showSystemUi = true)
@Composable
fun ArtSpaceApp(modifier: Modifier = Modifier
    .fillMaxSize()
    .padding(16.dp)
    ){
    //Stated
    val album by remember{
        mutableStateOf(getGaleries())
    }

    val lastIndex=album.lastIndex


        var currentIndex by remember{
            mutableStateOf(0)
        }

        val gallery:Gallery = when (currentIndex){
            in 0..lastIndex -> album[currentIndex]
            else -> {
                currentIndex=0
                album[0]
            }
        }
        //End State


        Surface(modifier=modifier) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ImageFrame(
                    modifier=Modifier.weight(1f),
                    imgRes = gallery.idImg
                )
                DescriptionCard(
                    title = gallery.title,
                    description = gallery.description,
                    year = gallery.year
                )
                NavigationButtons(
                    canNavigateToNext = currentIndex < lastIndex,
                    onNext={currentIndex++},
                    canNavigateToPrevious = currentIndex>0,
                    onPrevious={currentIndex--},
                )
            }
        }
    }

@Composable
fun ImageFrame(modifier: Modifier=Modifier, imgRes:Int, imgDesc:String="Description IMG"){
    Box(modifier = modifier.wrapContentSize()) {
        Image(
            painter = painterResource(imgRes),
            contentDescription = imgDesc,
            modifier = Modifier
                .border(4.dp, Color.Black, RectangleShape)
                .padding(24.dp)
        )
    }
}

@Composable
fun DescriptionCard(
    title: String,
    description: String,
    year: Int
){
    Surface(
        shadowElevation = 4.dp,
        modifier = Modifier
    ) {
        Column(
            modifier=Modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(text = title, style = MaterialTheme.typography.titleSmall)
            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)){
                        append("$description ")
                    }
                    append(year.toString())
                })
        }
    }
}

@Composable
fun NavigationButtons(
    onNext:() -> Unit,
    onPrevious:() -> Unit,
    canNavigateToNext:Boolean,
    canNavigateToPrevious:Boolean
){
    Row(
        modifier=Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = onPrevious,
            enabled = canNavigateToPrevious
        ) {
            Text(text = "Précédent")
        }
        Button(
            onClick = onNext,
            enabled = canNavigateToNext
        ) {
            Text(text = "Suivant")
        }
    }
}

data class Gallery(val idImg:Int, val title:String, val description:String,val year:Int)

fun getGaleries():List<Gallery>{
    return listOf(
        Gallery(R.drawable.photo_le_03_11_2022___20_09,"Titre","Sama Description",2022),
        Gallery(R.drawable.photo_le_31_10_2022___15_29,"Titre","Sama Description",2022),
        Gallery(R.drawable.photo_le_03_11_2022___20_10__2,"Titre d","Sama Description",2022),
        Gallery(R.drawable.photo_le_04_11_2022___08_03,"Titre d","Sama Description",2022),
        Gallery(R.drawable.photo_le_04_11_2022___09_08,"Titre d","Sama Description",2022),
    )
}