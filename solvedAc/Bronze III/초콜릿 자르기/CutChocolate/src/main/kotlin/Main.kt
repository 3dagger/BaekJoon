fun main() {
	val (N, M) = readLine()!!.split(" ").map { it.toInt() }
	println(N * M - 1)
}