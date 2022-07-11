import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val (R, B) = br.readLine().split(" ").map { it.toInt() }

	loop@for (i in 1..5000) {
		for (j in 1..4000) {
			if (i * j == R + B) {
				if (R == (i * 2) + ((j - 2) * 2)) {
					bw.write("$j $i")
					break@loop
				} else if (R == (j * 2) + ((i - 2) * 2)) {
					bw.write("$i $j")
					break@loop
				}
			}
		}
	}

	bw.flush()
	bw.close()
	br.close()
}

