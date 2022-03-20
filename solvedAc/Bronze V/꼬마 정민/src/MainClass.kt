class MainClass {
}

fun main() = readLine()!!.split(" ").let { println(it[0].toBigDecimal() + it[1].toBigDecimal() + it[2].toBigDecimal())}