package com.lannstark.lec03

import com.lannstark.lec01.Person

fun main() {
	val number1: Int? = 3
	val number2: Long = number1?.toLong() ?: 0L

	printAgeIfPerson2(Person("", 100))

	val person = Person("조재연", 100)
	println("이름 : ${person.name}")

	val withoutIndent =
	"""
		ABC
		123
		456
	""".trimIndent()
	println(withoutIndent)
}

// Object 대신에 사실 Any를 사용해야 한다
fun printAgeIfPerson(obj: Any) {
	if (obj is Person) {
		println(obj.name)
	}
}

fun printAgeIfPerson2(obj: Any?) {
	val person = obj as? Person
	println(person?.name)
}
