package com.example.eweek04a.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eweek04a.model.TodoItemFactory

@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    val todoList = remember {
//        mutableStateListOf<Item>()
        TodoItemFactory.makeTodoList()
    }

    var showPendingOnly by remember { mutableStateOf(false) }

    Column (modifier = Modifier.fillMaxSize().padding(14.dp)){
        TodoListTitle()
        TodoSwitch(checked=showPendingOnly) {
            showPendingOnly = it

        }
        TodoList(todoList, modifier=Modifier.weight(1f), showPendingOnly)
        TodoItemInput(todoList)
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}