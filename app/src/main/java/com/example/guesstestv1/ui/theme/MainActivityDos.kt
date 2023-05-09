package com.example.guesstestv1.ui.theme

import android.content.ClipData.Item
import android.content.Intent
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.guesstestv1.MainActivity

class MainActivityDos : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BodyContent()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BodyContent (){
    val context = LocalContext.current
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {
        item {

            Text(text = "PUNTAJES",
            color = Color.White,
            fontSize = 40.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(PaddingValues(top = 30.dp, bottom = 30.dp)),
            textAlign = TextAlign.Center)

            Row(horizontalArrangement =  Arrangement.SpaceBetween, modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)) {
                Text(text = "Usuario actual: Pepito",
                fontSize = 18.sp,
                color = Color.Yellow)

                Text(text = "Puntaje actual: 99",
                    fontSize = 18.sp,
                    color = Color.Yellow)
            }

            Row(horizontalArrangement =  Arrangement.SpaceBetween, modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)) {
                Text(text = "Usuario: Angel",
                    fontSize = 18.sp,
                    color = Color.White)

                Text(text = "Puntaje: 20",
                    fontSize = 18.sp,
                    color = Color.White)
            }

            Row(horizontalArrangement =  Arrangement.SpaceBetween, modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)) {
                Text(text = "Usuario: Roberto",
                    fontSize = 18.sp,
                    color = Color.White)

                Text(text = "Puntaje: 40",
                    fontSize = 18.sp,
                    color = Color.White)
            }

            Row(horizontalArrangement =  Arrangement.SpaceBetween, modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)) {
                Text(text = "Usuario: Alicia",
                    fontSize = 18.sp,
                    color = Color.White)

                Text(text = "Puntaje: 89",
                    fontSize = 18.sp,
                    color = Color.White)
            }

            Row(horizontalArrangement =  Arrangement.SpaceBetween, modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)) {
                Text(text = "Usuario: Roman",
                    fontSize = 18.sp,
                    color = Color.White)

                Text(text = "Puntaje: 11",
                    fontSize = 18.sp,
                    color = Color.White)
            }
            Row(horizontalArrangement =  Arrangement.SpaceBetween, modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)) {
                Text(text = "Usuario: Messi",
                    fontSize = 18.sp,
                    color = Color.White)

                Text(text = "Puntaje: 10",
                    fontSize = 18.sp,
                    color = Color.White)
            }

            Row(horizontalArrangement =  Arrangement.SpaceBetween, modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)){

                Button(
                    onClick = {
                        /*Navigacion entre pantalla*/
                        context.startActivity(Intent(context, MainActivity::class.java ))
                    },
                    //modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Botor de back" )
                    Text(text = "Volver al inicio",
                        color = Color.White,
                        fontSize = 17.sp
                    )
                }

                Button(onClick = {
                    context.startActivity(Intent(context, MainActivityDos::class.java))
                }) {
                    Icon(imageVector = Icons.Default.Refresh, contentDescription = "Botor de refres" )
                    Text(text = "Refresh point",
                        color = Color.White,
                        fontSize = 17.sp
                    )
                }


            }

        }
    }
}

