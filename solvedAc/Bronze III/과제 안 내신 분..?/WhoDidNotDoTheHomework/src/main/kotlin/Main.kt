fun main() {
	val n = mutableListOf<Int>()
	repeat(28) {
		n.add(readLine()!!.toInt())
	}

	val classList = mutableListOf<Int>()
	for (i in 1..30) {
		classList.add(i)
	}

	(classList - n.sorted().toSet()).forEach { println(it) }
}