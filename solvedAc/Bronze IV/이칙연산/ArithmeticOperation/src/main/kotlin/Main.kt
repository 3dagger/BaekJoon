import kotlin.math.max

fun main() {
	readLine()!!.split(" ").let { val (a, b, c) = it.map { it.toDouble() }; max(a * b / c, a / b * c).toInt()}.let { println(it) }
}