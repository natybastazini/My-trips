package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PersonOutline
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.mytrips.R

@Composable
fun GreetingSignUp(controleNavegacao: NavHostController) {

    var nomeState = remember {
        mutableStateOf("")
    }

    var phoneState = remember {
        mutableStateOf("")
    }

    var  emailState = remember {
        mutableStateOf("")
    }

    var passwordState = remember {
        mutableStateOf("")
    }

    var checkState = remember {
        mutableStateOf(false)
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
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .padding(bottom = 32.dp, top = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "SIGN UP",
                    color = Color(0xFFCF06F0),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    text = stringResource(id = R.string.no_account),
                    color = Color(0xFFA09C9C),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                )
            }
            Box(
                modifier = Modifier
                    .padding(bottom = 32.dp)
            ) {
                Card(
                    colors = CardDefaults.cardColors(Color(0xffF6F6F6)),
                    shape = RoundedCornerShape(50.dp),
                    border = BorderStroke(
                        width = 2.dp,
                        brush = Brush.horizontalGradient(
                            listOf(
                                Color(0xFFCF06F0),
                                Color.White
                            )
                        )
                    ),
                    elevation = CardDefaults.cardElevation(6.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.PersonOutline,
                        contentDescription = "Pessoa",
                        tint = Color(0xFFCF06F0),
                        modifier = Modifier
                            .size(80.dp)
                    )
                }
                Card(
                    modifier = Modifier
                        .offset(x = 60.dp, y = (64.dp)),
                    colors = CardDefaults.cardColors(Color.Transparent)
                ) {
                    Icon(
                        imageVector = Icons.Default.AddAPhoto,
                        contentDescription = "Câmera",
                        tint = Color(0xFFCF06F0),
                        modifier = Modifier
                            .size(26.dp)
                    )
                }
            }
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
                value = nomeState.value,
                onValueChange = {
                    nomeState.value = it
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Pessoa",
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
                    Text(text = stringResource(id = R.string.name))
                }
            )
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                value = phoneState.value,
                onValueChange = {
                    phoneState.value = it
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = "Telefone",
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
                    Text(text = stringResource(id = R.string.phone))
                }
            )
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
                    .fillMaxWidth(),
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
                    Text(text = stringResource(id = R.string.password))
                }
            )
        }
        Column(
            modifier = Modifier.padding(start = 10.dp, bottom = 4.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically


            ) {
                Checkbox(
                    checked = checkState.value,
                    onCheckedChange = {
                        checkState.value =! checkState.value
                    },
                    colors = CheckboxDefaults.colors(
                        checkedColor = Color(0xFFCF06F0), uncheckedColor = Color(0xFFCF06F0)
                    )
                )
                Text(
                    text = stringResource(id = R.string.eighteen),
                    fontWeight = FontWeight.Normal,
                    color = Color.Black
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp, end = 20.dp),
            horizontalArrangement = Arrangement.End,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {
                        controleNavegacao.navigate("home")
                              },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    colors = ButtonDefaults
                        .buttonColors(
                            containerColor = Color(0xFFCF06F0)
                        ),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(
                        text = stringResource(id = R.string.create_account),
                        modifier = Modifier
                            .padding(end = 2.dp),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = stringResource(id = R.string.have_account),
                        color = Color(0xFFA09C9C),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .padding(end = 2.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.sign_in),
                        modifier = Modifier
                            .clickable { controleNavegacao.navigate("login") },
                        color = Color(0xFFCF06f0),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
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

@Preview (showBackground =  true, showSystemUi = true)
@Composable
fun GreetingSignUpPreview() {
    GreetingSignUp(controleNavegacao = rememberNavController())

}