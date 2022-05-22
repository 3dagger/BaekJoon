fun main() {
	var res = ""
	repeat(readLine()!!.toInt()) {
		val list = mutableListOf<Int>()
		(1..readLine()!!.toInt()).forEach {
			list.add(it * (1..it + 1).sumOf { it })
		}

		res += "${list.sumOf { it }}\n"
	}

	println(res)
}