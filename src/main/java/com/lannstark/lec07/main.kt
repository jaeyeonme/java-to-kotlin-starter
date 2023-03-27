package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

// 주어진 문자열을 정수로 변경하는 예제
fun parseIntOrThrow(str: String): Int {
	try {
		return str.toInt();
	} catch (e: NumberFormatException) {
		throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
	}
}

// 주어진 문자열을 정수로 변경하는 예제 실패하면 null을 반환
fun parseIntOrThrowV2(str: String): Int? {
	return try {
		str.toInt()
	} catch (e: NumberFormatException) {
		null
	}
}

// 프로젝트 내 파일의 내용물을 읽어오는 예제
fun readFile() {
	// . : 현재위치
	val currentFile = File(".")
	val file = File(currentFile.absolutePath + "/a.txt")
	val reader = BufferedReader(FileReader(file))
	println(reader.readLine())
	reader.close()
}

// 프로젝트 내 파일의 내용물을 읽어오는 예제 - inline
fun readFile2(path: String) {
	BufferedReader(FileReader(path)).use { reader ->
		println(reader.readLine())
	}
}
