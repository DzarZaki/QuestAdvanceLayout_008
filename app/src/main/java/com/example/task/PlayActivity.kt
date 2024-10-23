package com.example.task

import android.telecom.Call.Details
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable

fun PlayActivity(){
    Column (modifier = Modifier.fillMaxSize()){
        HeaderSection()
        Text(text = "Kepada Yth,",
            modifier = Modifier.padding(2.dp))
        Text(text = "Dzar",
            modifier = Modifier.padding(16.dp))
        Spacer(modifier = Modifier.size(50.dp))
        DetailsSurat(
            judul = "Alamat",
            isinya = "Maman Alkatiri"
        )
        DetailsSurat(
            judul = "Alamat",
            isinya = "Kota Bandung, Jawa Barat, Indonesia"
        )
        DetailsSurat(
            judul = "No Telp",
            isinya = "089539248"
        )
        DetailsSurat(
            judul = "Kepentingan",
            isinya = "DetailSurat(\n" +
            "judul = \"Nama\",\n" +
            "isinya = \"maman Alkatiri\"\n"+
            ")\n" +
            "DetailsSurat(\n" +
                    "            judul = \"Kepentingan\",\n" +
                    "            isinya = \"DetailSurat(\\n\" +\n" +
                    "            \"judul = \\\"Nama\\\",\\n\" +\n" +
                    "            \"isinya = \\\"maman Alkatiri\\\"\\n\"+\n" +
                    "            \")\\n\" +"



        )

    }
}

@Composable
fun HeaderSection(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.DarkGray)
        .padding(15.dp)
    ){

    Row(modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){

        Column {
            Text(text = "Pemerintah Daerah Istimewa Yogyakarta",
                color = Color.White
            )
            Text("FAX : 021-121212,Tlp : 082111111",
                color = Color.White)
        }
        Box (
            contentAlignment = Alignment.BottomStart
        ){
            Image(
                painterResource(id = R.drawable.imm),
                contentDescription = "", modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )
            Icon(imageVector = Icons.Filled.Done,
                contentDescription = null
            )
        }

}
    }
}
@Composable
fun DetailsSurat(
    judul : String, isinya: String
){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
    ){


    Row (
        modifier = Modifier.fillMaxWidth()
    ){
        Text(text = "judul",
            modifier = Modifier.weight(0.8f))
        Text(text = ":",
            modifier = Modifier.weight(0.2f))
        Text(text = "isinya",
            modifier = Modifier.weight(2f))
    }


    }
}