fun main() {
	val finalsScore = List(5) { readLine()!!.toInt() }
	val moreThan40 = finalsScore.filterNot { it < 40 }
	val under40 = finalsScore.filter { it < 40 }.map { 40 }
	println((moreThan40 + under40).average().toInt())
}