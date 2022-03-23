import java.math.BigInteger

class MainClass {
}

fun main() {
	readLine()!!.split(" ").let { if(it[0].toBigInteger() - it[1].toBigInteger() < BigInteger("0") ) println((it[0].toBigInteger() - it[1].toBigInteger()) * BigInteger("-1")) else println(it[0].toBigInteger() - it[1].toBigInteger()) }
}