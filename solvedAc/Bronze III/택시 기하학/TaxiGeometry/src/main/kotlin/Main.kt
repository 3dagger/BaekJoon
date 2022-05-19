import kotlin.math.pow

fun main() {
	readLine()!!.toDouble()
		.let {
			println(String.format("%.6f", (it).pow(2) * Math.PI))
			println(String.format("%.6f", ((2 * it) * (2 * it) / 2)))
		}
}