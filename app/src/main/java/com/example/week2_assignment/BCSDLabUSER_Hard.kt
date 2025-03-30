package com.example.week2_assignment

open class BcsdLabUser(val name : String, val emoji : String)

class Beginners(name : String, val missed : Int) : BcsdLabUser(name, "🌱") {
    override fun toString() : String {
        return "Beginner $emoji : $name, Missed Assignment : $missed"
    }
}

class Regulars(name: String, val paid: Boolean) : BcsdLabUser(name, "🍏") {
    override fun toString(): String {
        val paided = if (paid) "Paid" else "Not Paid"
        return "Regular $emoji : $name, Paid Status : $paided"
    }
}

class Mentors(name: String, val email : String?) : BcsdLabUser(name, "✨") {
    override fun toString() : String {
        val emailInfo = email ?: "Empty"
        return "Mentor $emoji : $name, Email : $emailInfo"
    }
}

fun main() {
    val user : List<BcsdLabUser> = listOf(
        Beginners("비건형", 2),
        Beginners("양아치", 3),
        Regulars("레건형", true),
        Regulars("양기모", false),
        Mentors("멘건형", "rjsguddl1@koreatech.ac.kr"),
        Mentors("양머리", null)
    )

    println("비기너 목록 : ")
    user.filterIsInstance<Beginners>().forEach { println(it) }

    println("과제를 3회 이상 수행하지 못한 비기너 : ")
    user.filterIsInstance<Beginners>().filter { it.missed >= 3 }.forEach { println(it) }

    println("월 회비를 내지 않은 레귤러 : ")
    user.filterIsInstance<Regulars>().filter { !it.paid }.forEach { println(it) }

    println("성이 양씨인 사람 : ")
    user.filter { it.name.startsWith("양") }.forEach { println(it) }
}