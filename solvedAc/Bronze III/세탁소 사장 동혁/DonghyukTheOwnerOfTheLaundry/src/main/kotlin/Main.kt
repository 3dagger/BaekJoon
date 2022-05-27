// 쿼터 0.25
// 다임 0.10
// 니켈 0.05
// 페니 0.01
fun main() {
	var res = ""
	repeat(readLine()!!.toInt()) {
		var n = readLine()!!.toInt()

		if (n % 25 == 0) {
			res += "${n / 25} "
			n = 0
		} else {
			res += "${n / 25} "
			n %= 25
		}

		if (n % 10 == 0) {
			res += "${n / 10} "
			n = 0
		} else {
			res += "${n / 10} "
			n %= 10
		}

		if (n % 5 == 0) {
			res += "${n /5} "
			n = 0
		} else {
			res += "${n /5} "
			n %= 5
		}

		res += "${n / 1}"
		res += "\n"
	}
	println(res)
}