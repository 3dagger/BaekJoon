fun main() {
	var res = ""
	while (true) {
		val n = readLine()!!
		if (n == "0 0") {
			break
		}
		n.split(" ")
			.sumOf { it.toInt() }
			.also { res += "$it\n" }
	}
	println(res)
}