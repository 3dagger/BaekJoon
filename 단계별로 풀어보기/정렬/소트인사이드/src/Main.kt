fun main() {
	println(readLine()!!.map { it.digitToInt() }.sortedDescending().joinToString(""))
}