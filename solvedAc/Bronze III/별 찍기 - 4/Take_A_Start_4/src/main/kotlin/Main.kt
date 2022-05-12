import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))
	val n = br.readLine().toInt()
	for (i in 0 until n) {
		for (k in 0 until n) {
			bw.write(if (i > k) " " else "*")
		}
		bw.write("\n")
		bw.flush()
	}
	bw.close()
}

//fun main() {
//	val n = readLine()!!.toInt()
//	var res = ""
//
//	for (i in 0 until n) {
//		for (k in 0 until n) {
//			res += if (i > k) " "  else "*"
//		}
//		res += "\n"
//	}
//	println(res)
//
//}