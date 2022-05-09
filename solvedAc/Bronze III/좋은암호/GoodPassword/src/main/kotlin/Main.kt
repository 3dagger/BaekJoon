import java.math.BigInteger
import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
	val k = nextBigInteger()
	val n = nextInt()
	var badNum = 0

	for (i in 2 until n) {
		if (k % i.toBigInteger() == BigInteger.ZERO) {
			badNum = i
			break
		}
	}

	if (badNum == 0) println("GOOD")
	else println("BAD $badNum")
}