fun main() {
	readLine()!!.map {
		if (it.isLowerCase()) it.uppercase() else it.lowercase()
	}.let { println(it.joinToString("")) }
}