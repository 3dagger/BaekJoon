import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val (S1, S2, S3) = br.readLine().split(" ").map { it.toInt() }
	val sumList = mutableListOf<Int>()

	for (i in 1..S1) {
		for (j in 1..S2) {
			for (k in 1..S3) {
				sumList.add(i + j + k)
			}
		}
	}

	val b = sumList.groupBy { it }
		.maxOf { it.value.count() }

	bw.write(sumList.groupBy { it }.filter { it.value.count() == b }.keys.first().toString())


	bw.flush()
	bw.close()
	br.close()
}