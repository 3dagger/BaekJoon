import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))
	val (m, seed, x1, x2) = br.readLine().split(" ").map { it.toInt() }


	loop@for (i in 0..m) {
		for (j in 0..m) {
			if (((x1 == (i * seed + j) % m) && (x2 == (i * x1 + j) % m))) {
				bw.write("$i $j")
				break@loop
			}
		}
	}

	bw.flush()
	bw.close()
	br.close()
}