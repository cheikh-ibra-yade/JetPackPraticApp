package com.groupeclementine.praticapp.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.groupeclementine.benenmodule.data.dataSource.HeroRepository
import com.groupeclementine.benenmodule.data.model.Hero

@Preview
@Composable
fun SuperheroApp() {
    val repository = HeroRepository()

    Scaffold(topBar = {
        TopAppBar(Modifier.height(56.dp), backgroundColor = MaterialTheme.colors.background) {
            Text("Superhero",modifier =Modifier.weight(1f), color=MaterialTheme.colors.onPrimary, textAlign = TextAlign.Center, style = MaterialTheme.typography.h1)

        }
    }) {
        LazyColumn(
            modifier = Modifier
                .padding(16.dp)
                .padding(it),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(repository.getHeroes()) {
                HeroListItem(it)
            }
        }
    }
}


@Composable
fun HeroListItem(hero: Hero) {
    Card(
        elevation = 2.dp,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .sizeIn(minHeight = 75.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = stringResource(id = hero.nameRes),
                    style = MaterialTheme.typography.h3
                )

                Text(
                    text = stringResource(id = hero.descriptionRes),
                    style = MaterialTheme.typography.body1
                )
            }
            Spacer(modifier = Modifier.width(16.dp))

            Box(
                modifier = Modifier
                    .size(72.dp)
                    .clip(MaterialTheme.shapes.small)
            ) {
                Image(
                    painter = painterResource(id = hero.imageRes),
                    contentDescription = stringResource(
                        id = hero.nameRes,
                    ),
                    contentScale = ContentScale.FillWidth,
                    alignment = Alignment.Center

                    )
            }
        }
    }
}