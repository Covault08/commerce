package com.example.commerce

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.repeatOnLifecycle
import com.example.commerce.ui.screens.ItemsScreen
import com.example.commerce.ui.theme.ItemsComposeTheme
import com.example.commerce.viewmodel.ItemsViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ItemsComposeTheme {

                Scaffold(modifier = Modifier.fillMaxSize(), contentWindowInsets = WindowInsets.safeContent) { innerPadding ->
                    val viewModel = hiltViewModel<  ItemsViewModel>()
                    LaunchedEffect(Unit) {
                        repeatOnLifecycle(Lifecycle.State.STARTED){

                        }
                    }
                    ItemsScreen(viewModel = viewModel, modifier = Modifier.fillMaxSize().padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ItemsComposeTheme {
        Greeting("Android")
    }
}