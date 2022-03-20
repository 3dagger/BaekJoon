class MainClass {
}

fun main() = readLine()!!.split(" ").let { println(it[0].toBigInteger() + it[1].toBigInteger()) }