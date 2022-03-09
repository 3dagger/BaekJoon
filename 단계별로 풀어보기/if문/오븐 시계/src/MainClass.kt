class MainClass {
}

fun main() {
	val (nowHour, nowMin) = readLine()!!.let { it.split(" ")[0].toInt() to it.split(" ")[1].toInt()}
	val timeToCook = readLine()!!.toInt()

	val convertHour = ((nowHour * 60 + nowMin + timeToCook) / 60) % 24
	val convertMin = (nowHour * 60 + nowMin + timeToCook) % 60

	println("$convertHour $convertMin")
}