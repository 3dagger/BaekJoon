import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val plainText = br.readLine()
	val encryptionKey = br.readLine()

	for (i in plainText.indices) {
		bw.write((encryptionKey[i % encryptionKey.length].toInt() - plainText[i].toInt()).toString())
	}

	bw.flush()
	bw.close()
	br.close()
}

