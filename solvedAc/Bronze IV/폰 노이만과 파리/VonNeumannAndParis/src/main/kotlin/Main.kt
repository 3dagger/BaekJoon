// 기차 속도 S
// 파리 속도 T
// 처음 두 기차 사이의 거리 D
// 50, 75, 200
// (D / S * 2) T
fun main() {
	readLine()!!.split(" ").map { it.toInt() }.let { (it[2] / (it[0] * 2)) * it[1]}.let { println(it) }
}