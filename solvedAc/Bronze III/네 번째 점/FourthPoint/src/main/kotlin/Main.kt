fun main() {
	List(3) { readLine()!!.split(" ").map { it.toInt() } }
		.reduce { a, l -> listOf(a[0] xor l[0], a[1] xor l[1]) }
		.forEach { println("$it ") }
}

//fun main() {
//	val x = mutableListOf<Int>()
//	val y = mutableListOf<Int>()
//	repeat(3) {
//		readLine()!!.split(" ").let { x.add(it[0].toInt()); y.add(it[1].toInt()) }
//	}
//
//	var a = ""
//	if (x[0] != x[1] && x[0] != x[2]) {
//		a += x[0]
//	} else if (x[1] != x[0] && x[1] != x[2]) {
//		a += x[1]
//	} else {
//		a += x[2]
//	}
//
//	var b = ""
//	if (y[0] != y[1] && y[0] != y[2]) {
//		b += y[0]
//	} else if (y[1] != y[0] && y[1] != y[2]) {
//		b += y[1]
//	} else {
//		b += y[2]
//	}
//
//	println("$a $b")
//}