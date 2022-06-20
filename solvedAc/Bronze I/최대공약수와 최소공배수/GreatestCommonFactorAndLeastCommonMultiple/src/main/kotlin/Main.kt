fun main() {
	val (A, B) = readLine()!!.split(" ").map { it.toInt() }

	val gcd = getGcd(A, B)
	val lcm = getLcm(gcd, A, B)
	println(gcd)
	println(lcm)
}

fun getGcd(a: Int, b: Int): Int {
	return if (b != 0) getGcd(b, a % b) else a
}

fun getLcm(gcd: Int, a: Int, b: Int): Int {
	return (a * b) / gcd
}