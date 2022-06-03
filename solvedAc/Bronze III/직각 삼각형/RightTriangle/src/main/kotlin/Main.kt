import kotlin.math.pow

fun main() {
	var res = ""
	while (true) {
		val n = readLine()!!

		if (n == "0 0 0") {
			break
		}

		n.split(" ")
			.map { it.toFloat() }
			.sortedByDescending { it }
			.let {
				res += if (it[0].pow(2) == it[1].pow(2) + it[2].pow(2)) {
					"right"
				} else {
					"wrong"
				}
			}
		res += "\n"
	}

	println(res)
}