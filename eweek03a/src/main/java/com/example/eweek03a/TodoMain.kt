package com.example.eweek03a

import com.example.eweek03a.model.Item

fun main() {
    val todoService = TodoService(mutableListOf<Item>())
//    val todoService = TodoService(TodoListFactory.makeTodoList())

    while(true) {
        println("===== TodoList 메뉴 =====")
        println("1. 메모 등록")
        println("2. 메모 완료 체크")
        println("3. 메모 검색")
        println("4. 메모 전체 리스트 보기")
        println("5. 종료")
        println("메뉴 선택: ")
        val choice = readlnOrNull()?.toIntOrNull() ?: 0
        if (choice == 0) {
            println("올바른 메뉴번호를 선택하세요")
            continue;
        }
        when (choice) {
            1 -> todoService.addContent()
            2 -> todoService.changeToComp()
            3 -> todoService.lookUp()
            4 -> todoService.listTodos()
            5 -> {
                println("202214209 안태규")
                return
            }
        }
    }
}