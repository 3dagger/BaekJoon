import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
	val (A, B, V) = readLine()!!.split(" ").map { it.toInt() }

	var day = (V - B) / (A - B)
	if ((V - B) % (A - B) != 0) {
		day++
	}
	println(day)
}

//	val (A, B, V) = readLine()!!.split(" ").map { it.toInt() }
//
//	var climb = 0
//	var day = 0
//	while (true) {
//		day += 1
//		climb += A
//		if (climb >= V) {
//			break
//		}
//		climb -= B
//	}
//	println(day)
