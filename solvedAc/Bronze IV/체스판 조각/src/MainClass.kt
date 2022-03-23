class MainClass {
}

fun main() {
	readLine()!!.toInt().let { val x = it / 2; val y = it - x; println((x + 1) * (y + 1)) }
}