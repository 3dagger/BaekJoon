import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	while (true) {
		val n = br.readLine().split(" ")
		if (n[0] == "#") break

		var count = 0
		for (i in 1 until n.size) {
			n[i].forEach {
				if (it.uppercase() == n[0] || it.lowercase() == n[0]) {
					count++
				}
			}
		}

		bw.write("${n[0]} $count\n")
	}

	bw.flush()
	bw.close()
	br.close()
}