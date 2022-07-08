import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val sb = StringBuilder()

	val N = br.readLine().toInt()
	for (i in 1 until N + 1 ) {
		sb.append(i)
	}

	println(sb.indexOf(N.toString()) + 1)
}