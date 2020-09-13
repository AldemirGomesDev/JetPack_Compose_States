package com.aldemir.gomes.dev.jetpackcompose.ui.scoreview

import androidx.compose.getValue
import androidx.compose.mutableStateOf
import androidx.compose.setValue

class Score(
    homeTeam: String,
    homeScore: Int,
    visitorTeam: String,
    visitorScore: Int
) {
    var homeTeam by mutableStateOf(homeTeam)
    var homeScore by mutableStateOf(homeScore)
    var visitorTeam by mutableStateOf(visitorTeam)
    var visitorScore by mutableStateOf(visitorScore)
}