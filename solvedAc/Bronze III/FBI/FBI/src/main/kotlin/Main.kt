fun main() {
	val fbiList = mutableListOf<String>()
	repeat(5) {
		fbiList.add(readLine()!!)
	}

	val res = mutableListOf<Int>()
	fbiList.forEachIndexed { index, s ->
		if (s.contains("FBI")) {
			res.add(index + 1)
		}
	}

	if (res.isEmpty()) {
		println("HE GOT AWAY!")
	} else {
		println(res.sorted().joinToString(" "))
	}

}