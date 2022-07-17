import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val arr = IntArray(9) { br.readLine().toInt() }
	val sum = arr.sum()
	var n1 = 0
	var n2 = 0

	loop@for (i in 0 until 9) {
		for (j in i + 1 until 9) {
			if (sum - arr[i] - arr[j] == 100) {
				n1 = i
				n2 = j
				break@loop
			}
		}
	}

	for (i in 0 until 9) {
		if (i == n1 || i == n2) continue
		bw.write("${arr[i]}\n")
	}

	bw.flush()
	bw.close()
	br.close()
}