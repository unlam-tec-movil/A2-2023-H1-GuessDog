package com.example.guesstestv1

import android.content.Intent
import android.os.Bundle
import android.print.PrintAttributes.Margins
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.guesstestv1.screens.SecondScreens
import com.example.guesstestv1.ui.theme.GuessTestV1Theme
import com.example.guesstestv1.ui.theme.MainActivityDos

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        FirstScreens()
        }
    }


    @Preview(showBackground = true)
    @Composable
    public fun FirstScreens(){
        val context = LocalContext.current;
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)) {

            item {

                Text(text = "Guess Dog",
                    color = Color.White,
                    fontSize = 40.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(PaddingValues(top = 30.dp, bottom = 30.dp)),
                    textAlign = TextAlign.Center)

                //Dejo este espacio para remplazar por Imag
                Row() {

                    Image(painter = painterResource(id = R.drawable.ovejeroaleman),
                        contentDescription = "Overjero aleman",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop)


                }

                Row() {
                    Text(text = "Adivina la raza del perro",
                        fontSize = 24.sp,
                        color = Color.White,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp, vertical = 20.dp),
                        textAlign = TextAlign.Center)
                }

                Text(text = " - Raza del perro: Ovejero Aleman ",
                    fontSize = 18.sp,
                    color = Color.White)

                Text(text = " - Nombre del usuario: Pepito",
                    fontSize = 18.sp,
                    color = Color.White)

                Row(horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)){

                    Text(text = "Puntos actuales: 1",
                        fontSize = 16.sp,
                        color = Color.White)

                    Text(text = "Puntos maximo: 999",
                        fontSize = 16.sp,
                        color = Color.White)
                }


                Row() {
                    Button(
                        onClick = {
                            Log.i("Button", "Presiono el boton")
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(imageVector = Icons.Default.Refresh, contentDescription = "Botor de refres" )
                        Text(text = "Actualizar imagen",
                            color = Color.White,
                            fontSize = 17.sp
                        )
                    }

                }

                Row() {
                    Button(
                        onClick = {
                            /*Navigacion entre pantalla*/
                                  context.startActivity(Intent(context, MainActivityDos::class.java ))
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(imageVector = Icons.Default.Search, contentDescription = "Botor de refres" )
                        Text(text = "Ver Puntuacion",
                            color = Color.White,
                            fontSize = 17.sp
                        )
                    }

                }

            }
        }
    }
}
