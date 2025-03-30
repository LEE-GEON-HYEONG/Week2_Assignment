package com.example.week2_assignment

fun List<Int>.stepped(n : Int = 2) : List<Int> {
    val result = mutableListOf<Int>()
    for (i in indices step n) { // 인덱스를 n의 step으로 탐색
        result.add(this[i])
    }
    return result
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val stepList = list.stepped() //새로운 리스트
    println(stepList)
}