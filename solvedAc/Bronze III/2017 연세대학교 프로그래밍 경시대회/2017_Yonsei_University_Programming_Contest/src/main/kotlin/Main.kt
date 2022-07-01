import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val N = br.readLine().toInt()

	var count = 0
	for (i in 1..N) {
		for (k in i + 2..N) {
			for (j in 2..N step 2) {
				if (i + j + k == N) {
					count++
				}
			}
		}
	}

	if (count == 0) bw.write("0") else bw.write("$count")
	bw.flush()
	bw.close()
}