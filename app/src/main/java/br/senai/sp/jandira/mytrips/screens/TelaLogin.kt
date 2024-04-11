package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun GreetingLogin(controleNavegacao: NavHostController) {

    var emailState = remember {
        mutableStateOf("")
    }

    var passwordState = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Card(
                modifier = Modifier
                    .height(50.dp)
                    .width(160.dp),
                colors = CardDefaults.cardColors(Color(0xFFCF06F0)),
                shape = RoundedCornerShape(topStart = 0.dp, bottomStart = 32.dp)
            ) {

            }
        }
        Column(
            modifier = Modifier
                .padding(start = 20.dp)

        ) {
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
        Column(
            modifier = Modifier
                .padding(
                    horizontal = 20.dp
                )
        ) {
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                value = emailState.value,
                onValueChange = {
                    emailState.value = it
                },
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
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        vertical = 20.dp

                    ),
                shape = RoundedCornerShape(16.dp),
                value = passwordState.value,
                onValueChange = {
                    passwordState.value = it
                },
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
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 80.dp, end = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End,
            ) {
                Column(
                    modifier = Modifier
                        .padding(top = 20.dp),
                    horizontalAlignment = Alignment.End
                ) {
                    Button(
                        onClick = {
                                  controleNavegacao.navigate("home")
                        },
                        modifier = Modifier
                            .width(140.dp)
                            .height(60.dp),
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = Color(0xFFCF06F0)
                            ),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(
                            text = "SIGN IN",
                            modifier = Modifier
                                .padding(end = 2.dp),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Icon(
                            imageVector = Icons.Default.ArrowForward,
                            contentDescription = "Seta",
                            tint = Color.White,
                            modifier = Modifier
                                .size(26.dp)
                        )
                    }
                    Row(

                    ) {
                        Text(
                            text = "Don't have an account?",
                            color = Color(0xFFA09C9C),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal
                        )
                        Text(
                            text = "Sing up",
                            modifier = Modifier
                                .clickable {
                                    controleNavegacao.navigate("signup")
                                           },
                            color = Color(0xFFCF06f0),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Card(
                modifier = Modifier
                    .height(50.dp)
                    .width(160.dp),
                colors = CardDefaults.cardColors(Color(0xFFCF06F0)),
                shape = RoundedCornerShape(bottomStart = 0.dp, topEnd = 32.dp)
            ) {

            }
        }
    }
}

//@Preview
//@Composable
//fun GreetingHomePreview() {
//    GreetingLogin()
//
//}
