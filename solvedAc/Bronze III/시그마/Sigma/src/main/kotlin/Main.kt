fun main() {
	val (A, B) = readLine()!!.split(" ").map { it.toLong() }
	println(if (A <= B) (B - A + 1) * (B + A) / 2 else (A - B + 1) * (A + B) / 2)
}