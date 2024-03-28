package br.senai.sp.jandira.mytrips

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PersonOutline
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.PhoneAndroid
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
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
                    GreetingHome()
                }
            }
        }
    }
}

@Composable
fun GreetingLogin() {

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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyTripsTheme {
        GreetingLogin()
    }
}

@Composable
fun GreetingSignUp() {

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
                    text = "Create a new account",
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
                    Text(text = "Nome")
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
                    Text(text = "Phone")
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
                    Text(text = "Password")
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
                    text = "Over 18?",
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
                    onClick = { /*TODO*/ },
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
                        text = "CREATE ACCOUNT",
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
                        text = "Already have an account?",
                        color = Color(0xFFA09C9C),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal
                    )
                    Text(
                        text = "Sign in",
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewSingUp() {
    MyTripsTheme {
        GreetingSignUp()
    }
}

@Composable
fun GreetingHome() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F4F4))
    ) {
        Surface (modifier = Modifier
            .fillMaxWidth()
            .height(160.dp)){
            Image(
                painter = painterResource(id = R.drawable.paris),
                contentDescription = "Paisagem",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
            )
            Row {
                Text(text = "You're in Paris")
                Text(text = "My Trips")
            }
        }



        }
        Column (
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .padding(top = 220.dp)
        ){
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Categories",
                fontWeight = FontWeight.Normal,
                color = Color.Black,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(12.dp))
            LazyRow() {
                items(20) {
                    Card(
                        modifier = Modifier
                            .width(180.dp)
                            .height(120.dp)
                            .padding(end = 8.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0xFFCF06F0)
                            ),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {

                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth(),
                placeholder = {
                    Text(
                        text = "Search your destiny",
                        color = Color.Gray
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color.White,
                    unfocusedContainerColor = Color.White
                ),
                shape = RoundedCornerShape(16.dp),
                trailingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Botão de pesquisa",
                            tint = Color.Gray,
                            modifier = Modifier
                                .size(32.dp)
                        )
                    }
                }
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Past Trips",
                fontWeight = FontWeight.Normal,
                color = Color.Black,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(top = 10.dp)
            )
            LazyColumn(){
                items(20) {
                    Card(
                        modifier = Modifier
                            .fillMaxSize()
                            .height(120.dp)
                            .padding(bottom = 8.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0xFFCF06F0)
                            ),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {

                    }
                }
            }
        }
    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewHome() {
    MyTripsTheme {
        GreetingHome()
    }
}

