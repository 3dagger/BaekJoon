fun main() {
	val res = mutableListOf<Int>()
	val res2 = mutableListOf<Int>()

	repeat(4) {
		readLine()!!.split(" ").map { it.toInt() }.forEachIndexed { index, i -> if (index % 2 == 0) res.add(i * -1) else res.add(i)}
	}

	res.reduce { acc, i ->
		res2.add(acc + i)
		acc + i
	}

	res2.maxOf { it }.let { println(it) }

}
