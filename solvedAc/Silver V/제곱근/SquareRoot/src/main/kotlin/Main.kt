import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val N = br.readLine().toBigInteger()
	var start = BigInteger.ONE
	var end = N
	var mid = BigInteger.ZERO

	while (true) {
		mid = start.add(end)
		mid = mid.divide("2".toBigInteger())
		when (mid.multiply(mid).compareTo(N)) {
			0 -> break
			1 -> end = mid.subtract(BigInteger.ONE)
			else -> start = mid.add(BigInteger.ONE)
		}
	}

	bw.write("$mid")
	bw.flush()
	bw.close()
	br.close()
}
