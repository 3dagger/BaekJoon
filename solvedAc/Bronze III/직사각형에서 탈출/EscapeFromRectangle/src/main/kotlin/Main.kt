import kotlin.math.abs
import kotlin.math.min

fun main() {
	val (x, y, w, h) = readLine()!!.split(" ").map { it.toInt() }
	println(min(min(w - x, h - y), min(abs(0 - x), abs(0 - y))))
}