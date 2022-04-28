import kotlin.math.min

fun main() {
	val (S, A) = readLine()!!.split(" ").map { it.toInt() }
	if(S < 2 || A < 2) {
		println("0")
	}else {
		println(min(S / 2, A / 2))
	}
}


