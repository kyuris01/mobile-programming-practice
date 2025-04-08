package com.example.eweek05a.uicomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ButtonWithEmoji(
    likes: Int,
    dislikes: Int,
    onClickLikes: () -> Unit,
    onClickDisLikes: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { onClickLikes() }) {
                Text(text = "❤️", fontSize = 32.sp)
            }
            Text(text = likes.toString(), fontSize = 16.sp)
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { onClickDisLikes() }) {
                Text(text = "💙", fontSize = 32.sp)
            }
            Text(text = dislikes.toString(), fontSize = 16.sp)
        }
    }
}

@Preview
@Composable
private fun ButtonWithEmojiPreview() {
    var likes by remember { mutableIntStateOf(0) }
    var dislikes by remember { mutableIntStateOf(0) }

    ButtonWithEmoji(likes, dislikes, { likes++ }, { dislikes++ })
}