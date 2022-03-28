fun main() {
	List(readLine()!!.toInt()) { readLine()!! }.distinct().sortedBy { it }.sortedBy { it.length }.map { println(it) }
}