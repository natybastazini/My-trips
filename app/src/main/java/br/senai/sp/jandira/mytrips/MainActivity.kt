package br.senai.sp.jandira.mytrips

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Row (

        ){
            Card (
                modifier = Modifier
                    .height(60.dp)
                    .width(160.dp),
                colors = CardDefaults.cardColors(Color(0xFFCF06F0)),
                shape = RoundedCornerShape(topStart = 0.dp, bottomStart = 32.dp)
            ){

            }
        }
        Column {
            Text(
                text = "Login",
                color = Color(0xFFCF06F0),
                fontSize = 62.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "Please sing in to continue.",
                color = Color(0xFFA09C9C),
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal
            )
        }
        Column {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Envelope",
                        tint = Color(0xFFCF06F0),
                        modifier = Modifier
                            .size(32.dp)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(
                        0xFFCF06F0
                    )
                ),
                label = {
                    Text(text = "E-mail")
                }
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Cadeado",
                        tint = Color(0xFFCF06F0),
                        modifier = Modifier
                            .size(32.dp)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(
                        0xFFCF06F0
                    )
                ),
                label = {
                    Text(text = "Password")
                }
            )
            Row (){
                Column {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .width(140.dp)
                            .height(60.dp),
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = Color(0xFFCF06F0)
                            ),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(text = "SING IN")
                    }
                    Text(text = "Don't have an account?")

                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyTripsTheme {
        Greeting()
    }
}