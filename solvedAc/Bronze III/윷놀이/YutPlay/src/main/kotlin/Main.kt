// 배 0 등 1
// 도, 개, 걸, 윷, 모
// 도 0 1 1 1
// 개 0 0 1 1
// 걸 0 0 0 1
// 윷 0 0 0 0
// 모 1 1 1 1
fun main() {
	var res = ""
	repeat(3) {
		val yutResult = readLine()!!.split(" ").map { it.toInt() }
		val front = yutResult.count { it == 0 }
		val back = yutResult.count { it == 1 }

		when {
			front == 1 && back == 3 -> res += "A\n"
			front == 2 && back == 2 -> res += "B\n"
			front == 3 && back == 1 -> res += "C\n"
			front == 4 -> res += "D\n"
			back == 4 -> res += "E\n"
		}
	}
	println(res)
}