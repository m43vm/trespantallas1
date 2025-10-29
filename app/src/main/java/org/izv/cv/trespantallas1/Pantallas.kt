package org.izv.cv.trespantallas1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun PantallaImagenTituloTexto(navController: NavHostController) {
    Box( //lo primero
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.img), // tu imagen
            contentDescription = "Imagen superior",
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(8.dp))


        Text(
            text = """
                Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.
                
                In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app’s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI’s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.
            """.trimIndent(),
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
                    color = Color.Black
        )


        Spacer(modifier = Modifier.height(16.dp))


    }
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalAlignment = Alignment.Bottom
    ){
        Button(onClick = { navController.navigate("pantalla2") }) {
            Text("2")
        }
        Button(onClick = { navController.navigate("pantalla3") }) {
            Text("3")
        }
    }
}

@Composable
fun PantallaCirculoTick(navController: NavHostController) {
    Box( //lo primero
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(Color.Green, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "✓",
                fontSize = 80.sp,
                color = Color.Blue,
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "All task completed",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Text(
            text = "Nice work!",
            fontSize = 16.sp,
            color = Color.Black
        )



    }
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalAlignment = Alignment.Bottom
    ){
        Button(onClick = { navController.navigate("pantalla1") }) {
            Text("1")
        }
        Button(onClick = { navController.navigate("pantalla3") }) {
            Text("3")
        }
    }
}

@Composable
fun PantallaCuadrantes(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFD1C4E9))
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Text composable", fontWeight = FontWeight.Bold, color = Color.Black, )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text("Displays text and follows the recommended Material Design Gidelines", color = Color.Black, textAlign = TextAlign.Justify)
                }
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFB39DDB))
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Image composable", fontWeight = FontWeight.Bold, color = Color.Black)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text("Creates a composable that lays out and draws a given Painter class object", color = Color.Black, textAlign = TextAlign.Justify)
                }
            }
        }
        Row(modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFF9575CD))
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Row composable", fontWeight = FontWeight.Bold, color = Color.Black)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text("A layout composable that places its children in a horizonal sequence.", color = Color.Black, textAlign = TextAlign.Justify)
                }
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFF7E57C2))
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Column composable", fontWeight = FontWeight.Bold, color = Color.Black)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text("A layout composable that places its children  in a vertical sequence", color = Color.Black, textAlign = TextAlign.Justify)
                }
            }
        }
    }
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalAlignment = Alignment.Bottom
    ){
        Button(onClick = { navController.navigate("pantalla1") }) {
            Text("1")
        }
        Button(onClick = { navController.navigate("pantalla2") }) {
            Text("2")
        }
    }
}