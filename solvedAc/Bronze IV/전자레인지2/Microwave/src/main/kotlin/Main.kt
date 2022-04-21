import kotlin.math.abs

// A : 원래의 고기 온도
// B : 목표 온도
// C : 얼어 있는 고기를 1도 데우는 데 걸리는 시간
// D : 얼어있는 고기를 해동하는 데 걸리는 시간
// E : 얼어 있지 않은 고기를 1도 데우는데 걸리는 시간
fun main() {
	val (A, B, C, D, E) = List(5) { readLine()!!.toInt() }
	when {
		A < 0 -> println(abs(A) * C + D + B * E)
		else -> println((B - A) * E)
	}
}