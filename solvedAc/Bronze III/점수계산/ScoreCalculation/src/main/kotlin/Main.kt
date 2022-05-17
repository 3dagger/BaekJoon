fun main() {
	readLine()
	var count = 0
	readLine()!!.split(" ")
		.map { it.toInt() }
		.fold(0) { acc, i ->
		if (i == 0) {
			count = 0
			acc + 0
		} else {
			count++
			acc + count
		}
	}.let { println(it) }
}