fun main() {
	val (N, M) = readLine()!!.split(" ").map { it.toInt() }

	val card = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
	var sum = 0
	var max = 0

	for (i in 0 until N) {
		for (j in i + 1 until  N) {
			for (k in j + 1 until N) {
				sum = card[i] + card[j] + card[k]
				if (sum in (max + 1)..M) max = sum
			}
		}
	}

	println(max)
}