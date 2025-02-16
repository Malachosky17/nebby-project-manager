package io.jsm.nebbyprojectmanager

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainScreen()
        }

    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController)
        },
        content = { innerPadding ->
            // Main content of the screen with padding applied
            Box(modifier = Modifier.padding(innerPadding)) {
                Text("Main content here")
            }
        }
    )
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    BottomNavigation {
        BottomNavigationItem(
            icon = { Icon(Icons.Filled.Home, contentDescription = null) },
            label = { Text("Home") },
            selected = false,
            onClick = {
                // TODO handle navigation
            }
        )
        BottomNavigationItem(
            icon = { Icon(Icons.Filled.Dashboard, contentDescription = null) },
            label = { Text("Dashboard") },
            selected = false,
            onClick = {
                // TODO handle navigation
            })
        BottomNavigationItem(
            icon = { Icon(Icons.Filled.Notifications, contentDescription = null) },
            label = { Text("Notifications") },
            selected = false,
            onClick = {
                // TODO handle navigation
            })
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}