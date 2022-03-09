class MainClass {
}

fun main() {
	val dialMap = mapOf<Int, String>(3 to "ABC", 4 to "DEF", 5 to "GHI", 6 to "JKL", 7 to "MNO", 8 to "PQRS", 9 to "TUV", 10 to "WXYZ")
	var res = 0
	readLine()!!.forEach { a ->
		res += dialMap.filter { it.value.contains(a)}.keys.joinToString().toInt()
	}

	print(res)
}