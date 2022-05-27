fun main() {
	val A = readLine()!!.toString().toBigInteger()
	val operator = readLine().toString()
	val B = readLine()!!.toString().toBigInteger()

	when (operator) {
		"+" -> { println(A + B) }
		"*" -> { println(A * B) }
	}
}