package com.lannstark.lec04

fun main() {

	val money1 = JavaMoney(1_000L)
	val money2 = money1
	val money3 = JavaMoney(1_000L)

	println(money1 === money3)

	if (fun1() || fun2()) {
		println("본문")
	}
}

fun fun1(): Boolean {
	println("fun 1")
	return false
}

fun fun2(): Boolean {
	println("fun 2")
	return false
}
