package com.jiyoungmolcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jiyoungmolcompose.ui.theme.MolComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .background(Color.Green).fillMaxWidth().height(200.dp),
            ) {
                Text(text = "Hello")
                Box(
                    modifier = Modifier.fillMaxSize()
                        .padding(16.dp),
                    contentAlignment = Alignment.BottomEnd,
                ) {
                    Text(text = "Hoho")
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
