fun main() {
	val n = readLine()!!.toInt()
	var res = 0
	for (i in 0 until n) {
		var number = i
		var sum = 0

		while (number != 0) {
			sum += number % 10
			number /= 10
		}

		if (sum + i == n) {
			res = i
			break
		}
	}
	println(res)
}
