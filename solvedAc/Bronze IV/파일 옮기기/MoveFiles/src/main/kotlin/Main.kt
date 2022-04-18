fun main() {
	val (a, b) = readLine()!!.split(" ").let { it[0].toInt() to it[1].toInt() }
	val (c, d) = readLine()!!.split(" ").let { it[0].toInt() to it[1].toInt() }
	if(a + d <= b + c) {
		println(a + d)
	}else {
		println(b + c)
	}


}