fun main() {
	var res = ""
	while (true) {
		val n = readLine()!!

		if (n == "0") {
			break
		}

		res += if (n == n.reversed()) {
			"yes\n"
		} else {
			"no\n"
		}
	}
	println(res)
}