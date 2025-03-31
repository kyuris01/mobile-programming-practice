package com.example.eweek03a

import com.example.eweek03a.model.Item
import com.example.eweek03a.model.TodoStatus
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class TodoService(val todoList:MutableList<Item>) {

    fun addContent() {
        println("추가할 일정을 입력하세요")
        val content = readln()
        val currentTime = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("MM-dd HH:mm"))
        todoList.add(Item(content, currentTime))
    }

    fun listTodos() {
        if(todoList.isEmpty()) {
            println("등록된 일정이 없습니다.")
        } else {
            todoList.forEachIndexed { index, item ->
                println("$index : $item")
            }
        }
    }

    fun changeToComp() {
        println("완료 처리할 메모의 인덱스를 입력하세요: ")
        val index = readlnOrNull()?.toIntOrNull() ?: 0
        if (index < 0) { //a, -1, ..
            println("올바른 입력값이 아닙니다")
            return
        } else if(index > todoList.size-1) {
            println("올바른 인덱스 범위가 아닙니다")
            return
        }
        todoList[index].status = TodoStatus.COMPLETED
        println("메모 완료 처리됨: ${todoList[index].content} ${todoList[index].time} ${if(todoList[index].status==TodoStatus.COMPLETED) "완료" else "미완료"} ")
    }

    fun lookUp() {
        println("검색할 키워드를 입력하세요: ")
        val keyword = readln()
        val filterdTodoList = todoList.filter{it.content.contains(keyword)}
        println("검색결과: ")
        filterdTodoList.forEachIndexed { index, item ->
            println("$index : $item")
        }
    }
}