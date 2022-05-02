import java.math.BigInteger

fun main() {
	val tc1 = List(readLine()!!.toInt()) { readLine()!!.toBigDecimal() }.sumOf { it.toBigInteger() }
	val tc2 = List(readLine()!!.toInt()) { readLine()!!.toBigDecimal() }.sumOf { it.toBigInteger() }
	val tc3 = List(readLine()!!.toInt()) { readLine()!!.toBigDecimal() }.sumOf { it.toBigInteger() }
	println(processingResult(tc1))
	println(processingResult(tc2))
	println(processingResult(tc3))
}

fun processingResult(input: BigInteger): String {
	return if (input == BigInteger.ZERO) {
		"0"
	}else if (input < BigInteger.ZERO) {
		"-"
	}else {
		"+"
	}
}