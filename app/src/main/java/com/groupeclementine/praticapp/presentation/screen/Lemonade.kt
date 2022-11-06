package com.groupeclementine.praticapp.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.groupeclementine.praticapp.R

@Preview(showSystemUi = true, name = "Lemonade")
@Composable
fun Lemonade(modifier: Modifier=Modifier
    .fillMaxSize()
    .wrapContentSize(Alignment.Center)){

    var actuPage by remember {
        mutableStateOf(1)
    }

    var presTRepeat by remember {
        mutableStateOf((2..4).random())
    }

    val imgId = when(actuPage){
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart

    }

    val title = when(actuPage){
        1 -> "Tap the lemon tree to select a lemon"
        2 -> "Keep tapping the lemon to squeeze it"
        3 -> "Tap the lemonade to drink it"
        else -> "Tap the empty glass to start again"

    }
    
    Surface(modifier) {

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                modifier = Modifier,
                text = title
            )
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(imgId),
                contentDescription = "Lemon Tree",
                modifier = Modifier
                    .clickable {
                        when (actuPage) {
                            in 1..3 -> if (presTRepeat > 1 && actuPage == 2){
                                actuPage =2
                                presTRepeat--
                            } else actuPage++
                            else -> {
                                actuPage = 1
                                presTRepeat = (2..4).random()
                            }
                        }
                    }
                    .border(
                        4.dp,
                        Color.Cyan,
                        RectangleShape
                    )
                    .padding(12.dp)

            )
        }
    }
}