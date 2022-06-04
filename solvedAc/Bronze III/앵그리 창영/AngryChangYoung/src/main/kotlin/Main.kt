import kotlin.math.pow

fun main() {
	val (N, W, H) = readLine()!!.split(" ").map { it.toInt() }
	var res = ""
	repeat(N) {
		res += if (readLine()!!.toDouble().pow(2) <= W.toDouble().pow(2) + H.toDouble().pow(2)) {
			"DA"
		} else {
			"NE"
		}
		res += "\n"
	}
	println(res)
}