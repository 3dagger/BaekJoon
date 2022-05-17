fun main() {
	val total = mutableListOf<Int>()
	val result = mutableListOf<Int>()
	repeat(10) {
		readLine()!!.split(" ").map { it.toInt() }.let { total.add(it[0] * -1); total.add(it[1]) }
	}

	total.reduce { acc, i ->
		result.add(acc + i)
		acc + i
	}

	println(result.maxOf { it })
}
