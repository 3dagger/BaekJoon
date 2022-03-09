class MainClass {
}

fun main() {
	print(readLine()!!.reversed().split(" ").maxOf { it })
}