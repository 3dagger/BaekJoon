fun main() {
	var res = ""
	while (true) {
		val target = readLine()!!
		if (target.toInt() == 0) break
		else {
			val a = 2 + target.length - 1
			val num = target.map {
				when (it) {
					'1' -> '2'
					'0' -> '4'
					else -> '3'
				}
			}.sumOf { it.digitToInt() }
			res += "${a + num}\n"
		}
	}
	println(res)
}