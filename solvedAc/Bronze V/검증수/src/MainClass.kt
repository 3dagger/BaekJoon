class MainClass {
}

fun main() = println(readLine()!!.split(" ").map { it.toInt() * it.toInt() }.sum().rem(10))
