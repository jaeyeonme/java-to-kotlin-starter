package com.lannstark.lec14

fun main() {
	val dto1 = PersonDto("조재연", 100)
	val dto2 = PersonDto("조재연", 200)
	println(dto1 == dto2)
}

data class PersonDto(
	val name: String,
	val age: Int,
)

enum class Country(
	val code: String
) {
	KOREA("KO"),
	AMERICA("US"),
}

