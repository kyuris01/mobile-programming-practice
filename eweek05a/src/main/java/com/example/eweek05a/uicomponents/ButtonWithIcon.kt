package com.example.eweek05a.uicomponents

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ButtonWithIcon(likes: Int, onClick: () -> Unit) {
    Button(onClick = { onClick() }) {
        Icon(
            Icons.Default.Favorite,
            contentDescription = null,
            tint = if (likes > 0) Color.Red else LocalContentColor.current
        )
        if (likes > 0)
            Text("$likes")
        else
            Text("Like")
    }
}

@Preview
@Composable
private fun ButtonWithIconPreview() {
    var likes by remember{ mutableIntStateOf(0) }
    ButtonWithIcon(likes = likes, {likes++})
}