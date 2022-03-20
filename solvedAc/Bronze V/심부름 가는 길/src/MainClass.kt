class MainClass {
}

fun main() {
	var sum = 0
	repeat(4) {
		sum += readLine()!!.toInt()
	}

	println(sum / 60)
	println(sum % 60)
}