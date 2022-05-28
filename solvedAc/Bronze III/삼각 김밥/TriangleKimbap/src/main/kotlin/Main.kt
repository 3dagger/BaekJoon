fun main() {
	val (X, Y) = readLine()!!.split(" ").map { it.toDouble() }
	val seven25 = (1000 / Y) * X
	val kimbaplist = mutableListOf<Double>()

	kimbaplist.add(seven25)
	repeat (readLine()!!.toInt()) {
		readLine()!!.split(" ")
			.map { it.toDouble() }
			.also { kimbaplist.add((1000 / it[1]) * it[0]) }
	}

	println(String.format("%.2f", kimbaplist.minOf { it }))
}