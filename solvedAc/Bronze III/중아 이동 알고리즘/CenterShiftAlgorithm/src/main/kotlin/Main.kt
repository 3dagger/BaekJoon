import kotlin.math.pow

fun main() {
	var a = 2
	repeat(readLine()!!.toInt()) {
		a += (a-1)
	}

	println(a.toDouble().pow(2).toInt())
}