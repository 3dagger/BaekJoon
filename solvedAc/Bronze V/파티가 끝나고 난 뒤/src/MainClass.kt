class MainClass {
}

fun main() {
	val entryMembers = readLine()!!.split(" ").map { it.toInt() }.reduce { acc, i ->  acc * i}
	val articleMembers = readLine()!!.split(" ").map { it.toInt() - entryMembers }
	println(articleMembers.joinToString(" "))
}