fun main() {
	val n = readLine()!!.toInt()
	println(List(n) {
		readLine()!!.toInt()
	}.mapIndexed { index, i ->
		if (index != n - 1) {
			i - 1
		} else {
			i
		}
	}.sumOf { it })
}