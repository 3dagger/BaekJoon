class MainClass {
}

fun main() = readLine()!!.toInt().let { if(it % 5 == 0) println(it / 5) else println(it / 5 + 1) }