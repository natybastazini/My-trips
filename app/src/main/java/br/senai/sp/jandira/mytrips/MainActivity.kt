package br.senai.sp.jandira.mytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.mytrips.screens.GreetingHome
import br.senai.sp.jandira.mytrips.screens.GreetingLogin
import br.senai.sp.jandira.mytrips.screens.GreetingSignUp
//import br.senai.sp.jandira.mytrips.screens.GreetingHome
//import br.senai.sp.jandira.mytrips.screens.GreetingLogin
//import br.senai.sp.jandira.mytrips.screens.GreetingSignUp
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

                    val controleNavegacao = rememberNavController()
                    NavHost(navController = controleNavegacao,
                        startDestination = "login"
                    ){
                        composable(route = "login"){ GreetingLogin(controleNavegacao)}
                        composable(route = "home"){ GreetingHome(controleNavegacao) }
                        composable(route = "signup"){ GreetingSignUp(controleNavegacao) }
                    }

                }
            }
        }
    }
}

//@Composable
//fun GreetingLogin() {
//
//    var emailState = remember {
//        mutableStateOf("")
//    }
//
//    var passwordState = remember {
//        mutableStateOf("")
//    }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceBetween
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.End
//        ) {
//            Card(
//                modifier = Modifier
//                    .height(50.dp)
//                    .width(160.dp),
//                colors = CardDefaults.cardColors(Color(0xFFCF06F0)),
//                shape = RoundedCornerShape(topStart = 0.dp, bottomStart = 32.dp)
//            ) {
//
//            }
//        }
//        Column(
//            modifier = Modifier
//                .padding(start = 20.dp)
//
//        ) {
//            Text(
//                text = "Login",
//                color = Color(0xFFCF06F0),
//                fontSize = 62.sp,
//                fontWeight = FontWeight.ExtraBold
//            )
//            Text(
//                text = "Please sing in to continue.",
//                color = Color(0xFFA09C9C),
//                fontSize = 18.sp,
//                fontWeight = FontWeight.Normal
//            )
//        }
//        Column(
//            modifier = Modifier
//                .padding(
//                    horizontal = 20.dp
//                )
//        ) {
//            OutlinedTextField(
//                modifier = Modifier
//                    .fillMaxWidth(),
//                shape = RoundedCornerShape(16.dp),
//                value = emailState.value,
//                onValueChange = {
//                    emailState.value = it
//                },
//                leadingIcon = {
//                    Icon(
//                        imageVector = Icons.Default.Email,
//                        contentDescription = "Envelope",
//                        tint = Color(0xFFCF06F0),
//                        modifier = Modifier
//                            .size(32.dp)
//                    )
//                },
//                colors = OutlinedTextFieldDefaults.colors(
//                    unfocusedBorderColor = Color(
//                        0xFFCF06F0
//                    )
//                ),
//                label = {
//                    Text(text = "E-mail")
//                }
//            )
//            OutlinedTextField(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(
//                        vertical = 20.dp
//
//                    ),
//                shape = RoundedCornerShape(16.dp),
//                value = passwordState.value,
//                onValueChange = {
//                    passwordState.value = it
//                },
//                leadingIcon = {
//                    Icon(
//                        imageVector = Icons.Default.Lock,
//                        contentDescription = "Cadeado",
//                        tint = Color(0xFFCF06F0),
//                        modifier = Modifier
//                            .size(32.dp)
//                    )
//                },
//                colors = OutlinedTextFieldDefaults.colors(
//                    unfocusedBorderColor = Color(
//                        0xFFCF06F0
//                    )
//                ),
//                label = {
//                    Text(text = "Password")
//                }
//            )
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(bottom = 80.dp, end = 20.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.End,
//            ) {
//                Column(
//                    modifier = Modifier
//                        .padding(top = 20.dp),
//                    horizontalAlignment = Alignment.End
//                ) {
//                    Button(
//                        onClick = { /*TODO*/ },
//                        modifier = Modifier
//                            .width(140.dp)
//                            .height(60.dp),
//                        colors = ButtonDefaults
//                            .buttonColors(
//                                containerColor = Color(0xFFCF06F0)
//                            ),
//                        shape = RoundedCornerShape(16.dp)
//                    ) {
//                        Text(
//                            text = "SIGN IN",
//                            modifier = Modifier
//                                .padding(end = 2.dp),
//                            fontSize = 18.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                        Icon(
//                            imageVector = Icons.Default.ArrowForward,
//                            contentDescription = "Seta",
//                            tint = Color.White,
//                            modifier = Modifier
//                                .size(26.dp)
//                        )
//                    }
//                    Row(
//
//                    ) {
//                        Text(
//                            text = "Don't have an account?",
//                            color = Color(0xFFA09C9C),
//                            fontSize = 14.sp,
//                            fontWeight = FontWeight.Normal
//                        )
//                        Text(
//                            text = "Sing up",
//                            color = Color(0xFFCF06f0),
//                            fontSize = 14.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    }
//
//                }
//            }
//        }
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.Start
//        ) {
//            Card(
//                modifier = Modifier
//                    .height(50.dp)
//                    .width(160.dp),
//                colors = CardDefaults.cardColors(Color(0xFFCF06F0)),
//                shape = RoundedCornerShape(bottomStart = 0.dp, topEnd = 32.dp)
//            ) {
//
//            }
//        }
//    }
//}
//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun GreetingPreview() {
//    MyTripsTheme {
//        GreetingLogin()
//    }
//}
//
//@Composable
//fun GreetingSignUp() {
//
//    var nomeState = remember {
//        mutableStateOf("")
//    }
//
//    var phoneState = remember {
//        mutableStateOf("")
//    }
//
//    var  emailState = remember {
//        mutableStateOf("")
//    }
//
//    var passwordState = remember {
//        mutableStateOf("")
//    }
//
//    var checkState = remember {
//        mutableStateOf(false)
//    }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceBetween
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.End
//        ) {
//            Card(
//                modifier = Modifier
//                    .height(50.dp)
//                    .width(160.dp),
//                colors = CardDefaults.cardColors(Color(0xFFCF06F0)),
//                shape = RoundedCornerShape(topStart = 0.dp, bottomStart = 32.dp)
//            ) {
//
//            }
//        }
//        Column(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Column(
//                modifier = Modifier
//                    .padding(bottom = 32.dp, top = 10.dp),
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(
//                    text = "SIGN UP",
//                    color = Color(0xFFCF06F0),
//                    fontSize = 30.sp,
//                    fontWeight = FontWeight.ExtraBold
//                )
//                Text(
//                    text = "Create a new account",
//                    color = Color(0xFFA09C9C),
//                    fontSize = 14.sp,
//                    fontWeight = FontWeight.Normal
//                )
//            }
//            Box(
//                modifier = Modifier
//                    .padding(bottom = 32.dp)
//            ) {
//                Card(
//                    colors = CardDefaults.cardColors(Color(0xffF6F6F6)),
//                    shape = RoundedCornerShape(50.dp),
//                    border = BorderStroke(
//                        width = 2.dp,
//                        brush = Brush.horizontalGradient(
//                            listOf(
//                                Color(0xFFCF06F0),
//                                Color.White
//                            )
//                        )
//                    ),
//                    elevation = CardDefaults.cardElevation(6.dp)
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.PersonOutline,
//                        contentDescription = "Pessoa",
//                        tint = Color(0xFFCF06F0),
//                        modifier = Modifier
//                            .size(80.dp)
//                    )
//                }
//                Card(
//                    modifier = Modifier
//                        .offset(x = 60.dp, y = (64.dp)),
//                    colors = CardDefaults.cardColors(Color.Transparent)
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.AddAPhoto,
//                        contentDescription = "Câmera",
//                        tint = Color(0xFFCF06F0),
//                        modifier = Modifier
//                            .size(26.dp)
//                    )
//                }
//            }
//        }
//        Column(
//            modifier = Modifier
//                .padding(
//                    horizontal = 20.dp
//                )
//        ) {
//            OutlinedTextField(
//                modifier = Modifier
//                    .fillMaxWidth(),
//                shape = RoundedCornerShape(16.dp),
//                value = nomeState.value,
//                onValueChange = {
//                    nomeState.value = it
//                },
//                leadingIcon = {
//                    Icon(
//                        imageVector = Icons.Default.Person,
//                        contentDescription = "Pessoa",
//                        tint = Color(0xFFCF06F0),
//                        modifier = Modifier
//                            .size(32.dp)
//                    )
//                },
//                colors = OutlinedTextFieldDefaults.colors(
//                    unfocusedBorderColor = Color(
//                        0xFFCF06F0
//                    )
//                ),
//                label = {
//                    Text(text = "Nome")
//                }
//            )
//            OutlinedTextField(
//                modifier = Modifier
//                    .fillMaxWidth(),
//                shape = RoundedCornerShape(16.dp),
//                value = phoneState.value,
//                onValueChange = {
//                    phoneState.value = it
//                },
//                leadingIcon = {
//                    Icon(
//                        imageVector = Icons.Default.Phone,
//                        contentDescription = "Telefone",
//                        tint = Color(0xFFCF06F0),
//                        modifier = Modifier
//                            .size(32.dp)
//                    )
//                },
//                colors = OutlinedTextFieldDefaults.colors(
//                    unfocusedBorderColor = Color(
//                        0xFFCF06F0
//                    )
//                ),
//                label = {
//                    Text(text = "Phone")
//                }
//            )
//            OutlinedTextField(
//                modifier = Modifier
//                    .fillMaxWidth(),
//                shape = RoundedCornerShape(16.dp),
//                value = emailState.value,
//                onValueChange = {
//                    emailState.value = it
//                },
//                leadingIcon = {
//                    Icon(
//                        imageVector = Icons.Default.Email,
//                        contentDescription = "Envelope",
//                        tint = Color(0xFFCF06F0),
//                        modifier = Modifier
//                            .size(32.dp)
//                    )
//                },
//                colors = OutlinedTextFieldDefaults.colors(
//                    unfocusedBorderColor = Color(
//                        0xFFCF06F0
//                    )
//                ),
//                label = {
//                    Text(text = "E-mail")
//                }
//            )
//            OutlinedTextField(
//                modifier = Modifier
//                    .fillMaxWidth(),
//                shape = RoundedCornerShape(16.dp),
//                value = passwordState.value,
//                onValueChange = {
//                    passwordState.value = it
//                },
//                leadingIcon = {
//                    Icon(
//                        imageVector = Icons.Default.Lock,
//                        contentDescription = "Cadeado",
//                        tint = Color(0xFFCF06F0),
//                        modifier = Modifier
//                            .size(32.dp)
//                    )
//                },
//                colors = OutlinedTextFieldDefaults.colors(
//                    unfocusedBorderColor = Color(
//                        0xFFCF06F0
//                    )
//                ),
//                label = {
//                    Text(text = "Password")
//                }
//            )
//        }
//        Column(
//            modifier = Modifier.padding(start = 10.dp, bottom = 4.dp)
//        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically
//
//
//            ) {
//                Checkbox(
//                    checked = checkState.value,
//                    onCheckedChange = {
//                        checkState.value =! checkState.value
//                    },
//                    colors = CheckboxDefaults.colors(
//                        checkedColor = Color(0xFFCF06F0), uncheckedColor = Color(0xFFCF06F0)
//                    )
//                )
//                Text(
//                    text = "Over 18?",
//                    fontWeight = FontWeight.Normal,
//                    color = Color.Black
//                )
//            }
//        }
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(bottom = 10.dp, end = 20.dp),
//            horizontalArrangement = Arrangement.End,
//        ) {
//            Column(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(20.dp),
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Button(
//                    onClick = { /*TODO*/ },
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .height(60.dp),
//                    colors = ButtonDefaults
//                        .buttonColors(
//                            containerColor = Color(0xFFCF06F0)
//                        ),
//                    shape = RoundedCornerShape(16.dp)
//                ) {
//                    Text(
//                        text = "CREATE ACCOUNT",
//                        modifier = Modifier
//                            .padding(end = 2.dp),
//                        fontSize = 18.sp,
//                        fontWeight = FontWeight.Bold
//                    )
//                }
//                Row(
//                    modifier = Modifier
//                        .fillMaxWidth(),
//                    horizontalArrangement = Arrangement.End
//                ) {
//                    Text(
//                        text = "Already have an account?",
//                        color = Color(0xFFA09C9C),
//                        fontSize = 14.sp,
//                        fontWeight = FontWeight.Normal
//                    )
//                    Text(
//                        text = "Sign in",
//                        color = Color(0xFFCF06f0),
//                        fontSize = 14.sp,
//                        fontWeight = FontWeight.Bold
//                    )
//                }
//
//            }
//        }
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.Start
//        ) {
//            Card(
//                modifier = Modifier
//                    .height(50.dp)
//                    .width(160.dp),
//                colors = CardDefaults.cardColors(Color(0xFFCF06F0)),
//                shape = RoundedCornerShape(bottomStart = 0.dp, topEnd = 32.dp)
//            ) {
//
//            }
//        }
//    }
//}
//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun GreetingPreviewSingUp() {
//    MyTripsTheme {
//        GreetingSignUp()
//    }
//}
//
//@Composable
//fun GreetingHome() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color(0xFFF7F4F4))
//    ) {
//        Surface (modifier = Modifier
//            .fillMaxWidth()
//            .height(220.dp)){
//            Image(
//                painter = painterResource(id = R.drawable.paris),
//                contentDescription = "Paisagem",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxSize()
//            )
//            Row (
//                modifier = Modifier
//                    .padding(horizontal = 20.dp, vertical = 12.dp)
//            ){
//                Column (
//                    modifier = Modifier
//                        .fillMaxWidth()
//                ){
//                    Column (
//                        horizontalAlignment = Alignment.End,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                    ){
//                        Card (
//                            modifier = Modifier
//                                .width(80.dp)
//                                .height(80.dp),
//                            shape = CircleShape
//                        ){
//                            Image(
//                                painter = painterResource(id = R.drawable.bart),
//                                contentDescription = "",
//                                contentScale = ContentScale.Crop
//                            )
//                        }
//                            Text(
//                                text = "Susanna Hoffs",
//                                color =  Color.White,
//                                fontSize = 16.sp
//                            )
//                    }
//                    Spacer(modifier = Modifier.height(24.dp))
//                    Row (){
//                        Icon(
//                            imageVector = Icons.Default.Place,
//                            contentDescription = "Botão de pesquisa",
//                            tint = Color.White,
//                            modifier = Modifier
//                                .size(24.dp)
//                        )
//                        Text(
//                            text = "You're in Paris",
//                            color = Color.White,
//                            fontSize = 18.sp
//                        )
//                    }
//                    Text(
//                        text = "My Trips",
//                        color = Color.White,
//                        fontSize = 32.sp,
//                        fontWeight = FontWeight.Bold
//                    )
//                }
//            }
//        }
//
//
//
//        }
//        Column (
//            modifier = Modifier
//                .padding(horizontal = 20.dp)
//                .padding(top = 220.dp)
//        ){
//            Spacer(modifier = Modifier.height(12.dp))
//            Text(
//                text = "Categories",
//                fontWeight = FontWeight.Normal,
//                color = Color.Black,
//                fontSize = 18.sp
//            )
//            Spacer(modifier = Modifier.height(12.dp))
//            LazyRow() {
//                items(20) {
//                    Card(
//                        modifier = Modifier
//                            .width(180.dp)
//                            .height(100.dp)
//                            .padding(end = 12.dp),
//                        colors = CardDefaults
//                            .cardColors(
//                                containerColor = Color(0xFFCF06F0)
//                            ),
//                        elevation = CardDefaults.cardElevation(10.dp)
//                    ) {
//                        Column (
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .fillMaxSize(),
//                            verticalArrangement = Arrangement.Center,
//                            horizontalAlignment = Alignment.CenterHorizontally
//                        ){
//                            Icon(
//                                imageVector = Icons.Default.Mosque,
//                                contentDescription = "Montanha",
//                                tint = Color(0xFFFFFFFF),
//                                modifier = Modifier
//                                    .size(32.dp)
//                            )
//                            Text(
//                                text = "Montain",
//                                color = Color.White,
//                                fontSize = 20.sp
//                            )
//                        }
//                    }
//                }
//            }
//            Spacer(modifier = Modifier.height(12.dp))
//            OutlinedTextField(
//                value = "",
//                onValueChange = {},
//                modifier = Modifier
//                    .fillMaxWidth(),
//                placeholder = {
//                    Text(
//                        text = "Search your destiny",
//                        color = Color.Gray
//                    )
//                },
//                colors = OutlinedTextFieldDefaults.colors(
//                    unfocusedBorderColor = Color.White,
//                    unfocusedContainerColor = Color.White
//                ),
//                shape = RoundedCornerShape(16.dp),
//                trailingIcon = {
//                    IconButton(onClick = { /*TODO*/ }) {
//                        Icon(
//                            imageVector = Icons.Default.Search,
//                            contentDescription = "Botão de pesquisa",
//                            tint = Color.Gray,
//                            modifier = Modifier
//                                .size(32.dp)
//                        )
//                    }
//                }
//            )
//            Spacer(modifier = Modifier.height(12.dp))
//            Text(
//                text = "Past Trips",
//                fontWeight = FontWeight.Normal,
//                color = Color.Black,
//                fontSize = 18.sp,
//                modifier = Modifier
//                    .padding(top = 10.dp)
//            )
//            Spacer(modifier = Modifier.height(12.dp))
//            LazyColumn(){
//                items(20) {
//                    Card(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .height(200.dp)
//                            .padding(bottom = 12.dp),
//                        colors = CardDefaults
//                            .cardColors(
//                                containerColor = Color.White
//                            ),
//                        elevation = CardDefaults.cardElevation(10.dp)
//                    ) {
//                        Column {
//                            Text(
//                                text = "London, 2019",
//                                color = Color(0xFFCF06F0),
//                                fontWeight = FontWeight(510)
//                            )
//                            Text(
//                                text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
//                                color = Color.Gray
//                            )
//                            Row {
//                                Text(
//                                    text = "18 Feb - 21 Feb",
//                                    color = Color(0xFFCF06F0),
//                                    fontWeight = FontWeight(510)
//                                )
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun GreetingPreviewHome() {
//    MyTripsTheme {
//        GreetingHome()
//    }
//}
//
