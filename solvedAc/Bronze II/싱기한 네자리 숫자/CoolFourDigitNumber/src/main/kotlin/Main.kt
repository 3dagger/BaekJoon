import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	for (i in 2992..9999) {
		val decimal = i.toString().sumOf { if (it.isDigit()) it - '0' else toNum(it) }
		val duoDecimal = i.toString(12).sumOf { if (it.isDigit()) it - '0' else toNum(it) }
		val hexadecimal = i.toString(16).sumOf { if (it.isDigit()) it - '0' else toNum(it) }

		if (decimal == duoDecimal && decimal == hexadecimal) {
			bw.write("$i\n")
		}
	}

	bw.flush()
	bw.close()
}

fun toNum(n: Char): Int {
	var num = 0

	when (n) {
		'a' -> num = 10
		'b' -> num = 11
		'c' -> num = 12
		'd' -> num = 13
		'e' -> num = 14
		'f' -> num = 15
	}

	return num
}