class MainClass {
}

// 방학은 총 L
// 수학은 총 B 페이지
// 국어는 총 A 페이지
// 국어는 하루에 최대 C 페이지
// 수학은 하루에 최대 D 페이지
// 상근이가 방학동안 숙제를 하지 않고 놀 수 있는 최대 날의 수를 Return
// 결과는 방학 - 숙제를 다하는데 걸리는 일 수

// 20
// 25 국어
// 30 수학
// 6 국어
// 8 수학
// Answer -> 15
// 수학 최소 4일
// 국어 최소 4

fun main() {
	val l = readLine()!!.toInt()
	val a = readLine()!!.toInt()
	val b = readLine()!!.toInt()
	val c = readLine()!!.toInt()
	val d = readLine()!!.toInt()

	val koreanClassCount = if(a % c == 0) a / c else a / c + 1
	val mathClassCount = if(b % d == 0) b / d else b / d + 1

	if(koreanClassCount > mathClassCount) {
		println(l - koreanClassCount)
	}else {
		println(l - mathClassCount)
	}
}