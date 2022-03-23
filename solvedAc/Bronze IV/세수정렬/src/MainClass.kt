class MainClass {
}

fun main() {
	readLine()!!.split(" ").map { it.toInt() }.let { println(it.sorted().joinToString(" ")) }
}