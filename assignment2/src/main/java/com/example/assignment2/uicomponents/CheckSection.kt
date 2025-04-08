package com.example.assignment2.uicomponents

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.assignment2.model.ElementData

@Composable
fun CheckSection(
    modifier: Modifier = Modifier,
    elementData: ElementData,
    onCheckedChange: (Boolean) -> Unit
) {

    Row(verticalAlignment = Alignment.CenterVertically, modifier = modifier) {
        Checkbox(checked = elementData.visible, onCheckedChange = {onCheckedChange(it)})
//        Spacer(modifier = Modifier.width(4.dp))
        Text(elementData.elementType.toString(), fontSize = 10.sp)
    }
}

@Preview
@Composable
private fun CheckBoxPreview() {
}