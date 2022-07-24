import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val (A, B) = br.readLine().split(" ").map { it.toInt() }
	val resultArr = mutableListOf<Int>()

	for (i in -1000..1000) {
		if (i * (i + (2 * A)) == -1 * B) {
			resultArr.add(i)
		}
	}

	bw.write(resultArr.distinct().sorted().joinToString(" "))
	bw.flush()
	bw.close()
	br.close()
}