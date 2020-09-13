package com.aldemir.gomes.dev.jetpackcompose.ui.scoreview

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.OutlinedButton
import androidx.ui.text.TextStyle
import androidx.ui.unit.dp
import androidx.ui.unit.sp

@Composable
fun ScoreView(score: Score) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalGravity = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            TeamScore(
                team = score.homeTeam,
                score = score.homeScore,
                onUpdate = { newScore ->
                    score.homeScore = newScore
                }
            )
            Text(
                text = "x",
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
                style = TextStyle(
                    fontSize = 24.sp,
                    color = Color.Red
                )
            )
            TeamScore(
                team = score.visitorTeam,
                score = score.visitorScore,
                onUpdate = { newScore ->
                    score.visitorScore = newScore
                }
            )
        }
        OutlinedButton(
            text = { Text("Reset") },
            onClick = {
                score.homeScore = 0
                score.visitorScore = 0
            }
        )
    }
}