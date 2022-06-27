import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val (N, K) = br.readLine().split(" ").map { it.toInt() }

	val measureList = mutableListOf<Int>()
	for (i in 1..N) {
		if (N % i == 0) {
			measureList.add(i)
		}
	}

	if (measureList.size < K) {
		bw.write("0\n")
	} else {
		measureList.sort()
		bw.write("${measureList[K - 1]}\n")
	}

	bw.flush()
	bw.close()
}