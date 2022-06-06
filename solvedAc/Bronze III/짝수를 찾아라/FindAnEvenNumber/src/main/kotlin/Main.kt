fun main() {
	var res = ""
	repeat(readLine()!!.toInt()) {
		readLine()!!.split(" ").map { it.toInt() }
			.filter { it % 2 == 0 }
			.also { it ->
				res += "${it.sum()} ${it.minOf { it }}\n"
			}
	}

	println(res)
}