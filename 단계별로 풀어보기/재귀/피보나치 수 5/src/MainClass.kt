class MainClass {
}

fun main() {
	readLine()!!.toInt().let { println(fibonacci(it, 0, 1)) }
}

fun fibonacci(n: Int, first: Int, second: Int): Int {
	return if (n <= 0) {
		first
	} else {
		fibonacci(n - 1, second, first + second)
	}
}

fun fibonacciLoop(n: Int): Int {
	var first = 1
	var second = 1
	return when (n) {
		1 -> first
		2 -> second
		else -> {
			var current = first + second
			for (num in 3..n) {
				current = first + second
				first = second
				second = current
			}
			current
		}
	}
}