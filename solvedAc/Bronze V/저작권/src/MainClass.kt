class MainClass {
}

// 평균 값 I = 저작권이 있는 멜로디의 개수 / 앨범에 수록된 곡의 개수
// I = Answer / A
// Answer = I * A
// 앨범에 수록된 곡의 개수 A
// 평균 값 I
fun main() {
	readLine()!!.split(" ").map { it.toInt() }.let { if (it[1] == 100) println(it[0] * it[1]) else println(it[0] * (it[1] - 1) + 1) }
}