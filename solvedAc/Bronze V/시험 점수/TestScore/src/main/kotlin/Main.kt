fun main() {
	val S = readLine()!!.split(" ").sumOf { it.toInt() }
	val T = readLine()!!.split(" ").sumOf { it.toInt() }
	if(S >= T) println(S) else println(T)
}