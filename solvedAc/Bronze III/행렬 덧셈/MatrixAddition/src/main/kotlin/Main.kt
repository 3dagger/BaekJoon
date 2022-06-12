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