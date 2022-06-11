import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Scanner

fun main() {
	val (N, M) = readLine()!!.split(" ").map { it.toInt() }

	val A = mutableListOf<Int>()
	val B = mutableListOf<Int>()

	repeat(N * 2) {
		if (it < N) {
			readLine()!!.split(" ").map { A.add(it.toInt()) }
		} else {
			readLine()!!.split(" ").map { B.add(it.toInt()) }
		}
	}

	A.zip(B)
		.map { it.first + it.second }
		.chunked(M)
		.map { println(it.joinToString(" ")) }

}

//4 3
//1 1 1
//2 2 2
//0 1 0
//0 1 1
//3 3 3
//4 4 4
//5 5 100
//1 1 1