class MainClass {
}

fun main() = readLine()!!.split(" ").let { println(it[0].toInt() * it[1].toInt() + it[2].toInt() * it[3].toInt()) }
