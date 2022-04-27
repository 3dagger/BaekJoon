fun main() {
	val univScore = listOf("Soongsil", "Korea", "Hanyang").zip(readLine()!!.split(" ").map { it.toInt() })

	if(univScore.sumOf { it.second } < 100) {
		println(univScore.first { it.second == univScore.minOf { it.second } }.first)
	} else {
		println("OK")
	}

}