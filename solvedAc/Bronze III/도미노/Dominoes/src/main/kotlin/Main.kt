fun main() {
	val n = readLine()!!.toInt()
	var sum = 0

	for (i in 1..n) {
		for (j in i..(2 * i)) {
			sum += j
		}
	}

	println(sum)
}