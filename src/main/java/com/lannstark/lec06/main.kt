package com.lannstark.lec06

fun main() {

	val numbers = listOf(1L, 2L, 3L)
	for (number in numbers) {
		println(number)
	}

	for (i in 1..3) {
		println(i)
	}

	// 내려가는 경우
	for (i in 3 downTo 1) {
		println(i)
	}

	// 2칸씩 올라가는 경우
	for (i in 1..5 step 2) {
		println(i)
	}
}
