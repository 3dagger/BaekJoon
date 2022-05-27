fun main() {
	val grating = mutableListOf<Int>()

	repeat(9) {
		readLine()!!.split(" ").map { grating.add(it.toInt()) }
	}
	val maxOf = grating.maxOf { it }
	val indexOf = grating.indexOf(maxOf)
	println(maxOf)
	println("${indexOf / 9 + 1} ${indexOf % 9 + 1}")
}