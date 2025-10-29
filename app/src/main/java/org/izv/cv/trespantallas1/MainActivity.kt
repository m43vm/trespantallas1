package org.izv.cv.trespantallas1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.izv.cv.trespantallas1.ui.theme.Trespantallas1Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Trespantallas1Theme {
                val navController = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "pantalla1",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("pantalla1") { PantallaImagenTituloTexto(navController) }
                        composable("pantalla2") { PantallaCirculoTick(navController) }
                        composable("pantalla3") { PantallaCuadrantes(navController) }
                    }
                }
            }
        }
    }
}