import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	repeat(br.readLine().toInt()) {
		val (a, b) = br.readLine().split(" ").map { it.toInt() }
		val gcd = getGcd(a, b)
		val lcm = getLcm(a, b, gcd)

		bw.write("$lcm $gcd\n")
	}

	bw.flush()
	bw.close()
	br.close()
}

fun getGcd(a: Int, b: Int): Int {
	return if (b != 0) getGcd(b, a % b) else a
}

fun getLcm(a: Int, b: Int, gcd: Int): Int {
	return (a * b) / gcd
}
