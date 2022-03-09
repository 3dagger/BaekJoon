class MainClass {
}

fun main() {
	val croatiaLanguage = listOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
	var s = readLine()!!.toString()

	croatiaLanguage.filter { s.contains(it) }
		.forEach {
			s = s.replace(it, "1")
		}

	print(s.length)
}