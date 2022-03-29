fun main() {
	List(readLine()!!.toInt()) {
		readLine()!!.split(" ").let { it[0].toInt() to it[1].toInt() }
	}.sortedWith(compareBy({it.second}, {it.first})).map { println("${it.first} ${it.second}") }
}