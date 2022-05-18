fun main() {
	val list = mutableListOf<Int>()
	repeat(7) {
		list.add(readLine()!!.toInt())
	}

	val oddList = list.filter { it % 2 != 0 }
	if (oddList.isEmpty()) {
		println("-1")
	} else {
		println(oddList.sumOf { it })
		println(oddList.minOf { it })
	}
}