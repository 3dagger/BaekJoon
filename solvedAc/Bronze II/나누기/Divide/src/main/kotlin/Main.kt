import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val N = br.readLine()
	val F = br.readLine().toInt()
	var tmp = ""

	N.forEachIndexed { index, c ->
		if (index == N.length - 1 || index == N.length - 2) tmp += "0" else tmp += c
	}

	loop@ for (i in 0..100) {
		if ((tmp.toInt() + i) % F == 0) {
			if (i < 10) {
				bw.write("0$i")
			} else {
				bw.write("$i")
			}
			break@loop
		}
	}

	bw.flush()
	bw.close()
	br.close()
}