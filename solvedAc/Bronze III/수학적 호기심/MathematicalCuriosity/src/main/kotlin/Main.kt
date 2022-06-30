import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	repeat(br.readLine().toInt()) {
		val (N, M) = br.readLine().split(" ").map { it.toInt() }
		var count = 0
		for (i in 1 until N) {
			for (j in i + 1 until  N) {
				if (((j * j) + (i * i) + M) % (i * j) == 0) {
					count++
				}
			}
		}
		bw.write("$count\n")
	}

	bw.flush()
	bw.close()
}