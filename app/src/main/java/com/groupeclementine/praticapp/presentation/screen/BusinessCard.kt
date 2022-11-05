package com.groupeclementine.praticapp.presentation.screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Gite
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.groupeclementine.praticapp.R


@Preview(showSystemUi = true)
@Composable
fun BusinessCard(modifier: Modifier=Modifier){
      Column(
          horizontalAlignment = Alignment.CenterHorizontally,
          modifier=modifier
                  .background(Color(0xFF432E68))
      ) {
          Surface(Modifier.weight(1f)) {
              ProfileAvatar(R.drawable.avatar_cheikh_ibra_yade)
          }
          Spacer(modifier = Modifier.height(40.dp))
          ContactDetail()
      }

}

@Composable
fun ProfileAvatar(idAvatar:Int?, name:String="Cheikh Ibra YADE", description:String="Developer Android"){
    //TODO(if id Res is null we us First Caratere)
    val avatar = idAvatar ?: R.drawable.avatar_cheikh_ibra_yade
    Column(
        verticalArrangement= Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(Color(0xFF432E68))) {
        RoundedAvatart(avatar)
        Spacer(modifier = Modifier.height(8.dp))
        Text(

            text = name,
            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.onPrimary)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = description,
            style = MaterialTheme.typography.titleSmall.copy(color = Color(0xFF3A8D3E))
        )
    }
}

@Composable
fun RoundedAvatart(idAvatar:Int){
    Image(
        painter = painterResource(id = idAvatar),
        contentDescription = "Avatar",
        contentScale=ContentScale.Crop,
        modifier = Modifier
            .clip(CircleShape)
            .size(200.dp)
    )
}

@Composable
fun ContactDetail(){
    Column(
        Modifier
            .fillMaxWidth()
            ) {
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(2.dp)
            .background(Color.White))
        ContactDetailItem(Icons.Filled.Phone,"+221 77 594 66 96")

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(2.dp)
            .background(Color.White))
        ContactDetailItem(Icons.Filled.Share,"@cheikh-ibra-yade")

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(2.dp)
            .background(Color.White))
        ContactDetailItem(Icons.Filled.Mail,"yadecheikhibra@gmail.com")
    }
}

@Composable
fun ContactDetailItem(iconVector: ImageVector,info:String){
    Row(
        verticalAlignment=Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp, vertical = 8.dp)
    ) {
        Icon(iconVector, contentDescription = null, tint = Color(0xFF3A8D3E))
        Spacer(modifier = Modifier.width(12.dp))
        Text(info, style = MaterialTheme.typography.bodyLarge.copy(Color.White))
    }
}