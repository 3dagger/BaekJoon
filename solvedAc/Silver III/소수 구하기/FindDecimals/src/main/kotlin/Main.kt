import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val st = StringTokenizer(br.readLine())
	val sb = StringBuilder()

	val M = st.nextToken().toInt()
	val N = st.nextToken().toInt()
	var arr = Array(N + 1) { false }
	arr[0] = true
	arr[1] = true

	for (i in 2..sqrt((N + 1).toDouble()).toInt()) {
		if (arr[i]) continue

		for (j in i * i..N step +i) {
			arr[j] = true
		}
	}

	for (i in M..N) {
		if (!arr[i]) {
			sb.append(i).append("\n")
		}
	}
	println(sb)
}