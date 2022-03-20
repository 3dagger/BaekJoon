import java.math.BigInteger

class MainClass {
}

fun main() {
	val totalApples = readLine()!!.toBigInteger()
	val moreHaveKlaudia = readLine()!!.toBigInteger()
	val natalia = (totalApples - moreHaveKlaudia)/ BigInteger.valueOf(2)
	val klaudia =  natalia + moreHaveKlaudia
	println(klaudia)
	println(natalia)
}