package com.lannstark.lec16

fun main() {
	val str = "ABC"
	println(str.lastChar())
}

// 문자열에 존재하는 가장 마지막 문자를 가져오게 될 것
fun String.lastChar(): Char {
	return this[this.length - 1]
}

fun createPerson(firstName: String, lastName: String): Person {
	fun validateName(name: String, fieldName: String) {
		if (name.isEmpty()) {
			throw IllegalArgumentException("${firstName}은 비어있을 수 없습니다! 현재 값 : $name")
		}
	}

	validateName(firstName, "firstName")
	validateName(lastName, "lastName")

	return Person(firstName, lastName, 1)
}
