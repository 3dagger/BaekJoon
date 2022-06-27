import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Math.pow
import kotlin.math.abs
import kotlin.math.pow

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	while (true) {
		val n = br.readLine()
		if (n == "0 0") {
			break
		}
		val (B, N) = n.split(" ").map { it.toInt() }
		var A = 1
		var cal = 0

		while (true) {
			cal = (A.toDouble().pow(N)).toInt()
			if (cal >= B) break
			A++
		}
		val cal2 = ((A - 1).toDouble().pow(N)).toInt()
		if (abs(B - cal) < abs(B - cal2)) {
			bw.write("${A}\n")
		} else {
			bw.write("${A - 1}\n")
		}
	}

	bw.flush()
	bw.close()

}