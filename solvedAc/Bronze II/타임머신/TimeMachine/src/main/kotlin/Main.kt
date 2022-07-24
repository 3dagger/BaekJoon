import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))
	val time = br.readLine().split(":").map { it.toInt()}

	if (time.count { it > 59} > 0 ) {
		bw.write("0")
	} else {
		when (time.count { it in 1..12 }) {
			0 -> bw.write("0")
			1 -> bw.write("2")
			2 -> bw.write("4")
			3 -> bw.write("6")
		}
	}

	bw.flush()
	bw.close()
	br.close()
}

