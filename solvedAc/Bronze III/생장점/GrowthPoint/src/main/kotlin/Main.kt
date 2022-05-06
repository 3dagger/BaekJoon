fun main() {
	var res = ""
	while (true) {
		val line = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
		if (line.size == 1) {
			break
		}

		line.removeFirst()
		res += "${line.reduceIndexed { index: Int, acc: Int, i: Int ->
			if (index % 2 == 0) {
				acc * i
			} else {
				acc - i
			}
		}}\n"
	}
	println(res)
}