import java.math.BigInteger

fun main() {
	var res = ""
	repeat(readLine()!!.toInt()) {
		readLine()!!.toBigInteger()
			.also { if (it.rem(BigInteger.valueOf(2)) == BigInteger.ZERO) res += "even\n" else res += "odd\n"}
	}
	println(res)
}
