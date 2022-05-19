fun main() {
	var answer = ""
	repeat(readLine()!!.toInt()) {
		val res = mutableListOf<String>()
		readLine()!!.toInt()
			.toString(2)
			.reversed()
			.mapIndexed { index, c ->
				if (c == '1') {
					res.add(index.toString())
				}
			}
		answer += "${res.joinToString(" ")}\n"
	}

	println(answer)
}