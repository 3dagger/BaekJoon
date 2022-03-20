class MainClass {
}

fun main() {
	println(listOf(1, 1, 2, 2, 2, 8).zip(readLine()!!.split(" "))
		.map { it.first - it.second.toInt() }
		.joinToString(" "))
}

