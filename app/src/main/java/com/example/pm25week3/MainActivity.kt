package com.example.pm25week3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    var text by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {

        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Enter text") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            result = "Hello, $text"
        }) {
            Text("Submit")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = result)
    }
}
