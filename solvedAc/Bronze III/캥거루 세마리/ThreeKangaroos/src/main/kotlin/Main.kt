import kotlin.math.abs

fun main() {
	val (A, B, C) = readLine()!!.split(" ").map { it.toInt() }
	println((B - A).coerceAtLeast(C - B) -1)
}

// 2 3 5
// 3 4 5

// 3 5 9
// 5 6 9
// 6 7 9
// 7 8 9
