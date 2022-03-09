class MainClass {
}

//fun main() {
//	val a = readLine()!!
//	var convertA = if (a.toInt() < 10)  "0$a"  else  a
//	var count = 0
//
//	while (true) {
//		count++
//		val first = convertA[0]
//		val second = convertA[1]
//		val sum = first.digitToInt() + second.digitToInt()
//		convertA = "$second${sum.toString().last()}"
//
//		if (convertA.toInt() == a.toInt()) {
//			break
//		}
//	}
//	println(count)
//}

// 다른 사람의 풀이
fun main() = print(
	readLine()!!.toInt().let {
	var a = it
	var c = 0
	do {
		a = a % 10 * 10 + (a % 10 + a / 10) % 10
		c++
	} while (a != it)
	c
}
)
