fun main() {
	val a = readLine()!!.toCharArray()
	when(a.size) {
		2 -> println(a.sumOf { it.digitToInt() })
		3 -> {
			if(a[2].digitToInt() == 0) {
				println(a[0].digitToInt() + "${a[1]}${a[2]}".toInt())
			} else {
				println("${a[0]}${a[1]}".toInt() + a[2].digitToInt())
			}

		}
		4 -> println("${a[0]}${a[1]}".toInt() + "${a[2]}${a[3]}".toInt())
	}
}