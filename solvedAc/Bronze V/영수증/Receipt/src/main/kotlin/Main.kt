import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val X = br.readLine().toInt()
	val list = mutableListOf<Int>()
	repeat(br.readLine().toInt()) {
		val (a, b) = br.readLine().split(" ").map { it.toInt() }
		list.add(a * b)
	}

	if (list.sum() == X) bw.write("Yes") else bw.write("No")

	bw.flush()
	bw.close()
	br.close()
}