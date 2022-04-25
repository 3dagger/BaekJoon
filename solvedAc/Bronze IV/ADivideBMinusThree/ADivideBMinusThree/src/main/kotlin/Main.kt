import java.math.BigInteger
fun main() {
	val (A, B) = readLine()!!.split(" ").map { BigInteger(it) }
	val div = A.divide(B)
	val rem = A.remainder(B)

	if( A < BigInteger.ZERO && A != BigInteger.ZERO && B > BigInteger.ZERO) {
		val divide = div.subtract(BigInteger.ONE)
		val remain = A.subtract(B.multiply(divide))
		println("${divide}\n${remain}")
	} else if (A < BigInteger.ZERO && A != BigInteger.ZERO && B < BigInteger.ZERO) {
		val divide = div.add(BigInteger.ONE)
		val remain = A.subtract(B.multiply(divide))
		println("${divide}\n${remain}")
	} else {
		println("${div}\n${rem}")
	}

}