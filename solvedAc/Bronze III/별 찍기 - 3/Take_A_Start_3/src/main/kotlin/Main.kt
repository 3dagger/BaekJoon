fun main() {
	val n = readLine()!!.toInt()
	var res = ""

	for (i in n downTo 1) {
		for (k in 1..i) {
			res += "*"
		}
		println(res)
		res = ""
	}
}