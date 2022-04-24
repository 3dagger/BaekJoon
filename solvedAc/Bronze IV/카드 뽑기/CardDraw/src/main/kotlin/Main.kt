import kotlin.math.abs
import kotlin.math.*

fun main() {
	val (N, M, K) = readLine()!!.split(" ").map { it.toInt() }
	println(min(M, K) + min(N - M, N - K))
}