class MainClass {
}

fun main() {
	var sum = 0
	repeat(5) { sum += readLine()!!.toInt() }
	println(sum)
}