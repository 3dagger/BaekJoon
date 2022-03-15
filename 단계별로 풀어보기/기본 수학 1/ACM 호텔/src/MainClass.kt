class MainClass {
}

// H, W, N -> 호텔의 층 수, 각 층의 방 수, 몇 번째 손님
// 1 <= H, W <= 99, 1<= N <= H * W
fun main() {
	val tcCount = readLine()!!.toInt()

	var res = ""
	(1..tcCount).forEach {
		val (h, n) = readLine()!!.split(" ").let { Pair(it[0].toInt(), it[2].toInt()) }
		var floor = 0
		var room = 0

		if(n % h == 0) {
			floor = h * 100
			room = n / h
		}else {
			floor = (n % h) * 100
			room = (n / h) + 1
		}

		res += "${floor + room}"
		if(it != tcCount) res += "\n"
	}

	print(res)
}