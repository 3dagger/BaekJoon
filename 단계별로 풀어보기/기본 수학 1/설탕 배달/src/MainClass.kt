fun main() {
	var input = readLine()!!.toInt()
	var count = 0

	while (true) {
		if(input % 5 == 0) {
			println("${input / 5 + count}")
			break
		}else if (input <= 0) {
			println(-1)
			break
		}

		input -= 3
		count++
	}
}

