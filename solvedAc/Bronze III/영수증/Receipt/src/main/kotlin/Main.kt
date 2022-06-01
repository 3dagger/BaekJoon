fun main() {
	val totalPrice = readLine()!!.toInt()
	val sum = mutableListOf<Int>()
	repeat(9) {
		sum.add(readLine()!!.toInt())
	}
	println(totalPrice - sum.sum())
}