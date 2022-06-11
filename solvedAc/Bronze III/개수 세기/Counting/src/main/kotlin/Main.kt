fun main() {
	readLine()
	val n = readLine()!!.split(" ").map { it.toInt() }
	val v = readLine()!!.toInt()
	n.count { it == v }.also { println(it) }
}