class MainClass {
}

fun main() = readLine()!!.split(" ").let { println(it[1].toInt() * 2 - it[0].toInt()) }
