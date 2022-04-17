fun main() {
	val comparisonCriteria = readLine()!!.toInt()
	val comparisonTarget =  readLine()!!.split(" ").map { it.toInt() }
	println(comparisonTarget.count { it == comparisonCriteria })
 }