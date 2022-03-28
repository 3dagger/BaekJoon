fun main() {
	List(readLine()!!.toInt()) {
		readLine()!!.split(" ").let { it[0].toInt() to it[1] }
	}.sortedBy { it.first }.forEach { println("${it.first} ${it.second}") }
}