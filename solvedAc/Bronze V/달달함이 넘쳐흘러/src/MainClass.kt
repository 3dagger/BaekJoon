fun main() {
	val (ax, ay, az) = readLine()!!.split(" ").let { Triple(it[0].toInt(), it[1].toInt(), it[2].toInt()) }
	val (cx, cy, cz) = readLine()!!.split(" ").let { Triple(it[0].toInt(), it[1].toInt(), it[2].toInt()) }

	println("${cx - az} ${cy / ay} ${cz - ax}")
}