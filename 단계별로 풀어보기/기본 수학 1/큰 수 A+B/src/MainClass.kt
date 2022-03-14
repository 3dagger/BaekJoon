class MainClass {
}

fun main() {
	println(readLine()!!.split(" ").let { it[0].toBigInteger() + it[1].toBigInteger() })
}
