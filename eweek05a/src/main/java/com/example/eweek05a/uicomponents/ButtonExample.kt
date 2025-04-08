package com.example.eweek05a.uicomponents

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun FillButtonSample() {
    Button(onClick = {}) { Text("Filled") }
}

@Preview
@Composable
private fun FilledTonalButtonExample() {
    FilledTonalButton(onClick = {}) { Text("Tonal") }
}

@Preview
@Composable
private fun OutlinedButtonExample() {
    OutlinedButton(onClick = {}) { Text("Outlined") }
}

@Preview
@Composable
private fun ElevatedButtonExample() {
    ElevatedButton(onClick = {}) { Text("Elevated") }
}

@Preview
@Composable
private fun TextButtonExample() {
    TextButton(onClick = {}) { Text("Text Button") }
}

@Preview
@Composable
fun ButtonWithIconSample() {
    Button(
        onClick = { },
        contentPadding = ButtonDefaults.ButtonWithIconContentPadding
    ) {
        Icon(
            Icons.Filled.Favorite,
            contentDescription = "Localized description",
            modifier = Modifier.size(ButtonDefaults.IconSize)
        )
        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        Text("Like")
    }
}
