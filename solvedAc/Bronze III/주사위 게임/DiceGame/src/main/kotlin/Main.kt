fun main() {
	val res = mutableListOf<Int>()
	repeat (readLine()!!.toInt()) {
		val (A, B, C) = readLine()!!.split(" ").map { it.toInt() }
		val diceResult = listOf(A, B, C)

		if (A == B && B == C) {
			res.add(10000 + (A * 1000))
		} else if (A == B) {
			res.add(1000 + (A * 100))
		} else if (B == C) {
			res.add(1000 + (B * 100))
		} else if (A == C) {
			res.add(1000 + (A * 100))
		} else {
			res.add(diceResult.maxOf { it } * 100)
		}
	}
	println(res.maxOf { it })
}