package com.aldemir.gomes.dev.jetpackcompose.ui.scoreview

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.text.TextStyle
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import java.lang.Integer.max

@Composable
fun TeamScore(
    team: String,
    score: Int,
    onUpdate: (Int) -> Unit
) {
    Column(horizontalGravity = Alignment.CenterHorizontally) {
        Text(
            text = team,
            style = TextStyle(
                fontSize = 24.sp
            ),
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Button(
            text = { Text("+") },
            onClick = {
                onUpdate(score + 1)
            }
        )
        Text(
            text = score.toString(),
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(16.dp)
        )
        Button(
            text = { Text("-") },
            onClick = {
                onUpdate(max(score - 1, 0))
            }
        )
    }
}