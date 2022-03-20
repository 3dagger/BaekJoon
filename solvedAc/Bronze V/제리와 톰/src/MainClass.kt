fun main() {
	val (a, b) = readLine()!!.split(" ").let { it[0].toInt() to it[1].toInt() }
	println("${b - a} $b")
}