class MainClass {
}

//fun main() {
//	readLine()!!.toInt().let { if(it == 0) println(1) else println((1..it).reduce { acc, i -> acc * i }) }
//}

fun main() {
	readLine()!!.toInt().let { if(it == 0) println(1) else println(factorial(target = it)) }
}

fun factorial(target: Int): Int {
	return if(target == 1) target else target * factorial(target - 1)
}