package com.jiyoungmolcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jiyoungmolcompose.ui.theme.MolComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MolComposeTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Text("Hello!!!")
                        Spacer(modifier = Modifier.width(16.dp))
                        Text("World")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text("Hello $name!")
}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    MolComposeTheme {
        Greeting("지영")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    MolComposeTheme {
        Greeting("마이크")
    }
}
