import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))
	br.readLine().toInt()
	val str = br.readLine().map { (it.code % 96).toBigInteger() }

	str.mapIndexed { index, bigInteger ->
		bigInteger.multiply(BigInteger.valueOf(31).pow(index))
	}
	.sumOf { it }
	.also {
		bw.apply {
			write("${it.remainder(BigInteger.valueOf(1234567891))}")
			flush()
			close()
		}
	}
}