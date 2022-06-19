fun main() {
	readLine()
	val n = readLine()!!.split(" ")
		.map { it.toInt() }

	var totalCount = 0
	n.forEachIndexed { index, i ->
		var count = 0
		(1..i).forEach {
			if (i % it == 0) {
				count++
			}
		}
		if (count == 2) {
			totalCount++
		}
	}

	println(totalCount)
}