// A 300
// B 60
// C 10

fun main() {
	var target = readLine()!!.toInt()
	var A = 0
	var B = 0
	var C = 0

	if(target % 10 != 0) {
		println(-1)
	}else {
		if(target >= 300) {
			A = target / 300
			target %= 300
		}
		if (target >= 60) {
			B = target / 60
			target %= 60
		}
		C = target / 10
		println("$A $B $C")
	}
}