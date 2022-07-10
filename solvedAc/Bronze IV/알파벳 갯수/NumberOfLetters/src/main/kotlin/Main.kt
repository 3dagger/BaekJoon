import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val alphabetList = Array(26) { 0 }
	br.readLine().forEach {
		alphabetList[it.toInt() % 97]++
	}

	bw.write(alphabetList.joinToString(" "))
	bw.flush()
	bw.close()
	br.close()
}