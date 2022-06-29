import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	for (i in 1..100) {
		for (j in 2..i) {
			for (k in j..i) {
				for (l in k..i) {
					if (i * i * i == j * j * j + k * k * k + l * l * l) {
						bw.write("Cube = $i, Triple = ($j,$k,$l)\n")
					}
				}
			}
		}
	}

	bw.flush()
	bw.close()
}
