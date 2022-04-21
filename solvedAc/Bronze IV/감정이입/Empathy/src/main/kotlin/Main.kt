fun main() {
	List(2) {readLine()!!.toLong(2) }.reduce { acc, i -> acc * i }.toString(2).let { println(it) }
}