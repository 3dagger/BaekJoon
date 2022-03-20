class MainClass {
}

fun main() {
	val (n, m, k) = readLine()!!.split(" ").let { Triple(it[0].toInt(), it[1].toInt(), it[2].toInt())}
	println("${k / m } ${k % m}")
}