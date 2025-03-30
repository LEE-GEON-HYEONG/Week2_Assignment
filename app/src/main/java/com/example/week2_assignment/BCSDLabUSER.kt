package com.example.week2_assignment

//비기너 클래스
class Beginner(val name : String, val missed : Int) {
    private val emoji = "🌱"
    override fun toString() : String {
        return "Beginner $emoji : $name, Missed Assignment : $missed"
    }
}

//레귤러 클래스
class Regular(val name : String, val Paid : Boolean) {
    private val emoji = "🍏"
    override fun toString(): String {
        val paided = if (Paid) "Paid" else "Not Paid"
        return "Regular $emoji : $name, Paid Status : $paided"
    }
}

//멘토 클래스
class Mentor(val name : String, val email : String?) {
    private val emoji = "✨"
    override fun toString() : String {
        val emailInfo = email ?: "Empty"
        return "Mentor $emoji : $name, Email : $emailInfo"
    }
}

fun main() {
    val beginner = Beginner("비건형", 2)
    val regular = Regular("레건형", true)
    val mentor = Mentor("멘건형", null)

    println(beginner)
    println(regular)
    println(mentor)
}