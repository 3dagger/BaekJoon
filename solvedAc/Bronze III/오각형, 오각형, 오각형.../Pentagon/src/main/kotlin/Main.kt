fun main() {
	val n = readLine()!!.toLong()
	var res = 0L
	var increase = 0L

	for (i in 0 until n) {
		if (res > 0) {
			res += increase
			increase += 3
		}else {
			res = 5
			increase = 7
		}
	}
	println(res.rem(45678))
}