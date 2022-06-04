fun main() {
	var res = ""
	while (true) {
		val n = readLine()!!
		if (n == "0 0") {
			break
		}

		n.split(" ")
			.map { it.toInt() }
			.let {
				res += if (it[0] > it[1]) {
					"Yes"
				} else {
					"No"
				}
			}

		res += "\n"
	}
	println(res)
}