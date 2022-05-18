fun main() {
	var (N, M, K) = readLine()!!.split(" ").map { it.toInt() }
	var res = 0

	while (N >= 2 && M >= 1 && M + N >= K + 3) {
		N -= 2
		M -= 1
		res += 1
	}

	println(res)
}