fun main() {
	var res = ""
	while (true) {
		val n = readLine()!!
		if (n == "0 0") {
			break
		}

		n.split(" ")
			.map { it.toInt() }
			.also {
				res += if (it[1] % it[0] == 0) {
					"factor\n"
				} else if (it[0] % it[1] == 0) {
					"multiple\n"
				} else {
					"neither\n"
				}
			}
	}
	println(res)
}