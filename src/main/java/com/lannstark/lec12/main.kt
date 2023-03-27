package com.lannstark.lec12

class Person private constructor(
	private val name: String,
	private val age: Int,
) {
	companion object {
		private val MIN_AGE = 0

		@JvmStatic
		fun newBaby(name: String): Person {
			return Person(name, MIN_AGE)
		}
	}
}
