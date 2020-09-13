package com.aldemir.gomes.dev.jetpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.getValue
import androidx.compose.setValue
import androidx.compose.state
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Checkbox
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.material.TopAppBar
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.aldemir.gomes.dev.jetpackcompose.ui.scoreview.Score
import com.aldemir.gomes.dev.jetpackcompose.ui.scoreview.ScoreView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Column {
                        TopAppBar(title = {
                            Text("JetPack Compose")
                        })
                        ScoreView(
                            Score("Corinthians", 0, "São Paulo", 0)
                        )
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialTheme {
        ScoreView(
            Score("Corinthians", 0, "São Paulo", 0)
        )
    }
}
