
fun main() {
	var n = readLine()!!.toInt()
	var i = 1
	while (n > i) {
		n -= i++
	}

	println(if (i % 2 == 0) "$n/${i-n+1}" else "${i-n+1}/$n")
}
