import kotlin.math.abs

fun main() {
	val (x, y) = readLine()!!.split(" ").map { it.toInt() }
	val x1 = if (x % 4 == 0) x / 4 else x / 4 + 1
	val y1 = if (x % 4 == 0) 4 else x % 4
	val x2 = if (y % 4 == 0) y / 4 else y / 4 + 1
	val y2 = if (y % 4 == 0) 4 else y % 4

	println((abs(x1 - x2) +  abs(y1 - y2)))
}