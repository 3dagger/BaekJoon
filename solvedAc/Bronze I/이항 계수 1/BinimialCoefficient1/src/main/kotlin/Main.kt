fun main() {
	val (N, K) = readLine()!!.split(" ").map { it.toInt() }

	val nFactorial = (1..N).fold(1) { acc, i -> acc * i }
	val kFactorial = (1..K).fold(1) { acc, i -> acc * i }
	val nkFactorial = (1..(N - K)).fold(1) { acc, i -> acc * i }

	println(nFactorial / (kFactorial * nkFactorial))
}