import kotlin.math.pow

fun main() {
	readLine()!!.map {
		it.digitToInt().toDouble().pow(5)
	}.sumOf { it.toInt() }.let { println(it) }
}