class MainClass {
}

fun main() {
	val readLine = readLine()!!.toInt()
	var res = ""

	repeat((1..readLine).count()) {
		val next = readLine()!!.split(" ")

		next[1].forEach { a ->
			(1..next[0].toInt()).forEach { res += a }
		}

		res += "\n"
	}

	print(res)
}