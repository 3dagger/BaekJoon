// 나올수 있는 경우의 수는 총 3가지 (2, 1, 0)
fun main() {
	val (A, B, C, D) = readLine()!!.split(" ").map { it.toInt() }
	val AB = A + B
	val CD = C + D

	readLine()!!.split(" ")
		.map { it.toInt() }
		.forEach {
			var attackTime = 0

			if (AB < it) {
				if (it % AB <= A) attackTime += 1
			} else {
				if (it <= A) attackTime += 1
			}

			if (CD < it) {
				if (it % CD <= C) attackTime += 1
			} else {
				if (it <= C) attackTime += 1
			}
			println(attackTime)
		}
}