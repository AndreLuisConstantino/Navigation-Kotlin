package br.senai.sp.jandira.navigation.screens.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun MenuScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color.Blue),

        ) {
        Column (
            modifier = Modifier
                .width(600.dp)
                .height(700.dp)
                .padding(30.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Text(
                text = "MENU",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Left,
            )
            Spacer(modifier = Modifier.height(150.dp))
            Button(onClick = { navController.navigate("perfil")}) {
                Text(
                    text = "PERFIL",
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(200.dp))
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Button(onClick = {navController.navigate("pedidos")}) {
                    Text(
                        text = "PEDIDOS",
                        color = Color.White
                    )
                }
                Button(onClick = { navController.navigate("login")}) {
                    Text(
                        text = "SAIR",
                        color = Color.White
                    )
                }
            }

        }

    }
}

//@Preview
//@Composable
//fun MenuScreenPreview() {
//    MenuScreen()
//}