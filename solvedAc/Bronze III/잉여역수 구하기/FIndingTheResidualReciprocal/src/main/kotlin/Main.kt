import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val (a, m) = br.readLine().split(" ").map { it.toInt() }

	loop@for (i in 1..10000) {
		if (a * i % m == 1) {
			bw.write("$i")
			break@loop
		}
	}

	bw.flush()
	bw.close()
	br.close()
}

