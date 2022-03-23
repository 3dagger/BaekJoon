class MainClass {
}

fun main() {
	val (hour, min, sec) = readLine()!!.split(" ").let { Triple(it[0].toInt(), it[1].toInt(), it[2].toInt()) }
	val cookingTime = readLine()!!.toInt()
	var totalSec = ((hour * 60) * 60) + (min * 60) + sec + cookingTime

	if(totalSec > 86400) {
		totalSec %= 86400
	}

	val resHour = totalSec / 3600
	val resMin = (totalSec % 3600) / 60
	val resSec = (totalSec % 3600) % 60


	println("$resHour $resMin $resSec")
}