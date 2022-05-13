import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))
	val n = br.readLine().toInt()

	for (i in 1 .. n) {
		for (k in i until  n) {
			bw.write(" ")
		}
		for (j in 0 until (2 * i - 1)) {
			bw.write("*")
		}
		bw.write("\n")
		bw.flush()
	}
	bw.close()
}