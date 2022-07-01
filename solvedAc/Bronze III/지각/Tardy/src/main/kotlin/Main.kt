import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	repeat(br.readLine().toInt()) {
		val d = br.readLine().toInt()

		var maximumRateTime = 0
		for (i in 1..d) {
			if (i + (i * i) <= d) {
				maximumRateTime = i
			}
		}

		bw.write("$maximumRateTime\n")
	}

	bw.flush()
	bw.close()
}