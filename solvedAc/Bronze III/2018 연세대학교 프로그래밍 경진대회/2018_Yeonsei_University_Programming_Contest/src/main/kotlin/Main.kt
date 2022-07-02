import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val totalNumberOfFireworks = br.readLine().toInt()
	for (i in 1..totalNumberOfFireworks) {
		if (1 + i + (i * i) == totalNumberOfFireworks) {
			bw.write("$i")
			break
		}
	}

	bw.flush()
	bw.close()
	br.close()
}
