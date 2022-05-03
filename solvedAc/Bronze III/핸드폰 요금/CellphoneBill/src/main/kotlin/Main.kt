import kotlin.math.ceil

fun main() {
	readLine()
	val callCount = readLine()!!.split(" ").map { it.toInt() }
	val yongsikBill = callCount.map { if(it % 30 == 0) ((it / 30) + 1) * 10 else  ceil(it.toFloat() / 30).toInt() * 10 }.sumOf { it }
	val minsikBill = callCount.map { if(it % 60 == 0) ((it / 60) + 1) * 15 else ceil(it.toFloat() / 60).toInt() * 15 }.sumOf { it }

	when (yongsikBill) {
		minsikBill -> println("Y M $yongsikBill")
		minOf(yongsikBill, minsikBill) -> println("Y $yongsikBill")
		else -> println("M $minsikBill")
	}
}

