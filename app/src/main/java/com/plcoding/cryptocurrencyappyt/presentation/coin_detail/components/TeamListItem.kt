package com.plcoding.cryptocurrencyappyt.presentation.coin_detail.components

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import com.plcoding.cryptocurrencyappyt.data.remote.dto.TeamMember

@Composable
fun TeamListItem (
    teamMember: TeamMember,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = teamMember.position,
            style = MaterialTheme.typography.body2,
            fontStyle = FontStyle.Italic
        )
    }
}