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
		i.toString().forEach {
			if (it == '3' || it == '6' || it == '9') {
				count++
			}
		}
	}

	bw.write("$count")
	bw.flush()
	bw.close()
	br.close()
}