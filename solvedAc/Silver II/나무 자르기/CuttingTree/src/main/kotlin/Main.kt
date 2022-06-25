import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val (N, M) = br.readLine()
		.split(" ")
		.map { it.toInt() }

	val arr = IntArray(N)
	br.readLine()
		.split(" ")
		.mapIndexed { index, s -> arr[index] = s.toInt()}

	arr.sort()
	bw.write("${arr.bSearch(M)}")
	bw.flush()
	bw.close()

}

fun IntArray.bSearch(value: Int): Int {
	var left = 0
	var mid = 0
	var right = this.last()

	while (left <= right) {
		mid = (left + right) / 2
		var sum = 0L

		this.forEach {
			if (it - mid > 0) {
				sum += (it - mid).toLong()
			}
		}

		if (sum < value) {
			right = mid - 1
		} else {
			left = mid + 1
		}
	}
	return right
}