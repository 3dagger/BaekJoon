fun main() {
	val result = mutableListOf<Pair<Int, Int>>()
	repeat(5) {
		result.add(Pair(it + 1, readLine()!!.split(" ").map { it.toInt() }.sumOf { it }))
	}

	result.sortByDescending { it.second }
	println("${result.first().first} ${result.first().second}")
}