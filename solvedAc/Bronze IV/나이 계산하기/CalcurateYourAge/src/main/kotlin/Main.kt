fun main(args: Array<String>) {
	val birthday = readLine()!!.split(" ").map { it.toInt() }
	val today = readLine()!!.split(" ").map { it.toInt() }

	val yearCount = today[0] - birthday[0]

	if(birthday[0] == today[0]) {
		println(yearCount)
	} else {
		if(birthday[1] > today[1]) {
			println(yearCount - 1)
		} else if(birthday[1] == today[1]) {
			if(birthday[2] <= today[2]) {
				println(yearCount)
			}else {
				println(yearCount - 1)
			}
		}else {
			println(yearCount)
		}
	}

	println(yearCount + 1)
	println(yearCount)
}