
class MainClass {
}

fun main() {
	val readLine = readLine()!!.toInt()
	var res = ""

	(1..readLine).forEach {
		val a = readLine()!!
		val total = a.split(" ").map { it.toInt() }.toMutableList()
		val totalStudentsCount = total[0]
		total.removeAt(0)

		val passRatio = String.format("%.3f", total.count { it > total.average() }.toDouble() / totalStudentsCount.toDouble() * 100)

		res += if(it == readLine) {
			"${passRatio}%"
		}else {
			"${passRatio}%\n"
		}

	}

	print(res)
}