package com.lannstark.lec02

fun main() {
	var str: String? = null
	println(str?.length ?: 0)
}

fun startsWithA1(str: String?): Boolean {
	return str?.startsWith("A")
		?: throw IllegalArgumentException("null이 들어왔습니다")

//	if (str == null) {
//		throw IllegalArgumentException("null이 들어왔습니다.")
//	}
//	return str.startsWith("A")
}

fun startWithA2(str: String?): Boolean? {
	return str?.startsWith("A")

//	if (str == null) {
//		return null
//	}
//	return str.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
	return str?.startsWith("A") ?: false

//	if (str == null) {
//		return false
//	}
//	return str.startsWith("A")
}

fun startsWithA4(str: String?): Boolean {
	return str!!.startsWith("A")
}
