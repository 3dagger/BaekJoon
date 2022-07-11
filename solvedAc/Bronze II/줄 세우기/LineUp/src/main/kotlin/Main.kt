import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))
	val (A, B) = br.readLine().split(" ")
	val (N, L) = A.toInt() to B.toInt()
	var count = 0
	var saveI = 0

	while (count != N) {
		saveI++
		if (!saveI.toString().contains(B)) count++
	}
	bw.write("$saveI")
	bw.flush()
	bw.close()
	br.close()
}