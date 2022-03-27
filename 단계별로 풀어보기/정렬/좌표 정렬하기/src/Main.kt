fun main() {
	List(readLine()!!.toInt()) {
		readLine()!!.split(" ").let { listOf(it[0].toInt(), it[1].toInt()) }
	}.sortedWith { o1, o2 ->
		if (o1[0] == o2[0]) {
			o1[1] - o2[1]
		} else {
			o1[0] - o2[0]
		}
	}.map { println(it.joinToString(" ")) }
}