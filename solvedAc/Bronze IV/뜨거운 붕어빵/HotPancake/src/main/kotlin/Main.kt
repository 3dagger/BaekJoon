import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val (N, M) = br.readLine().split(" ").map { it.toInt() }

	repeat(N) {
		bw.write("${br.readLine().reversed()}\n")
	}

	bw.flush()
	bw.close()
	br.close()
}