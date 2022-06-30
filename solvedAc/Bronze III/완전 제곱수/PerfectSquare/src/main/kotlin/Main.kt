import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val N = br.readLine().toInt()
	var count = 0
	for (i in 1..500) {
		for (j in i + 1..500) {
			if (j * j == i * i + N) {
				count++
			}
		}
	}

	bw.write("$count")
	bw.flush()
	bw.close()
}