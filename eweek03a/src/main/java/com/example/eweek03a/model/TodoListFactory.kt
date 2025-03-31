package com.example.eweek03a.model

object TodoListFactory {
    fun makeTodoList() = mutableListOf(
        Item("모프 공부하기1", "03-19 13:09"),
        Item("모프 공부하기2", "03-19 14:09", TodoStatus.COMPLETED),
        Item("모프 공부하기3", "03-19 15:09", TodoStatus.COMPLETED),
        Item("모프 공부하기4", "03-19 16:09"),
    )
}