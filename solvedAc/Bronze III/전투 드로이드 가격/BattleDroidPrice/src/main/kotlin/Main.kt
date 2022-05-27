fun main() {
	var res = ""
	repeat(readLine()!!.toInt()) {
		readLine()!!
			.split(" ")
			.map { it.toInt() }
			.mapIndexed { index, s ->
				when (index) {
					0 -> s * 350.34
					1 -> s * 230.90
					2 -> s * 190.55
					3 -> s * 125.30
					4 -> s * 180.90
					else -> 0.0
				}
			}
			.sumOf { String.format("%.2f", it).toDouble() }
			.also { res += if (it.toString().split(".")[1].length == 1) "$${it}0\n" else "$${it}\n" }
	}

	println(res)
}