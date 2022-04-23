fun main() {
	val tile = readLine()!!.split(" ").map { it.toLong() }
	println(tile[0] * tile[1] / 2)
}