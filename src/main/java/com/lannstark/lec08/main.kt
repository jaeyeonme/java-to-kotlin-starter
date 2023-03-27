package com.lannstark.lec08

fun main() {
	repeat("Hello World", useNewLine = false)
	printNameAndGender(name = "조재연", gender = "MALE")
	printAll("A", "B", "C")

	var array = arrayOf("A", "B", "C")
	printAll(*array)
}

// 두 정수를 받아 더 큰 정수를 반환하는 예제
fun max(a: Int, b: Int) = if (a > b) a else b

// 주어진 문자열을 N번 출력하는 예제
fun repeat(
	str: String,
	num: Int = 3,
	useNewLine: Boolean = true
) {
	for (i in 1..num) {
		if (useNewLine) {
			println(str)
		} else {
			println(str)
		}
	}
}

fun printNameAndGender(name: String, gender: String) {
	println(name)
	println(gender)
}

fun printAll(vararg strings: String) {
	for (str in strings) {
		println(str)
	}
}
