import java.util.*

class MainClass {
}

fun main() {
	val scan = Scanner(System.`in`)
	val n  = scan.next()
	var remain = 0
	n.forEach {
		remain = (remain * 10 + (it.code - '0'.code)) % 20000303
	}
	println(remain)
}
