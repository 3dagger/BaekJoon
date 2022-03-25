class MainClass {
}
fun main() {
	val burgerList = List(3) { readLine()!!.toInt() }
	val drinkList = List(2) { readLine()!!.toInt() }
	println(burgerList.minOf { it } + drinkList.minOf { it } - 50)
}

