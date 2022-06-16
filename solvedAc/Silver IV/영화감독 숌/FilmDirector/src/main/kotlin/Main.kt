fun main() {
	val n = readLine()!!.toInt()
	var num = 666
	var count = 1

	while (count != n) {
		num++
		if (num.toString().contains("666")) {
			count++
		}
	}
	println(num)
}