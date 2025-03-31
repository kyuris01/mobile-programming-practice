package com.example.eweek04a.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eweek04a.model.Item
import com.example.eweek04a.model.TodoStatus

@Composable
fun TodoItem(item: Item, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = item.content,
            fontSize = 16.sp,
            style = if (item.status == TodoStatus.COMPLETED)
                TextStyle(textDecoration = TextDecoration.LineThrough)
            else
                TextStyle(textDecoration = TextDecoration.None)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = item.time, fontSize = 10.sp)

    }
}

@Preview
@Composable
private fun TodoItemPreview() {
    Column {
        TodoItem(item = Item("모프 공부하기1", "03-26 12:38"))
        TodoItem(item = Item("모프 공부하기2", "03-26 13:38", TodoStatus.COMPLETED))
    }
}