package com.groupeclementine.praticapp

import android.media.Image
import android.os.Bundle
import android.service.controls.actions.ModeAction
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.groupeclementine.praticapp.presentation.screen.ArtSpaceApp
import com.groupeclementine.praticapp.presentation.screen.BusinessCard
import com.groupeclementine.praticapp.ui.theme.PraticAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PraticAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    ArtSpaceApp()
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCard()
}

@Composable
fun ModeAction() {
    Row {
        Column {
        }
    }
}

@Preview
@Composable
fun GFGG() {
    ModeAction()
}