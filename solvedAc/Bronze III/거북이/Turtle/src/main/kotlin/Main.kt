fun main() {
	readLine()!!.split(" ")
		.map { it.toInt() }
		.sortedByDescending { it }
		.let { println(it[1] * it[3]) }
}