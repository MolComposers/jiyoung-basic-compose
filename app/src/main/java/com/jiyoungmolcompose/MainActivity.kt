package com.jiyoungmolcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /*
            [일반 Column 사용]
             val scrollState = rememberScrollState()
            Column(modifier = Modifier.background(Color.Green).fillMaxWidth().verticalScroll(scrollState)) {
                for (i in 1..50) {
                    Text("글씨 $i")
                }
            }
             */
            LazyColumn(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxWidth(),
                contentPadding = PaddingValues(16.dp), // modifier에 정의해줘도 됨
                verticalArrangement = Arrangement.spacedBy(4.dp), // 아이템 간의 간격을 줌
            ) {
                item {
                    Text("Header")
                }
                items(50) { index ->
                    Text("글씨 $index")
                }
                item {
                    Text("Footer")
                }
            }
        }
    }
}
