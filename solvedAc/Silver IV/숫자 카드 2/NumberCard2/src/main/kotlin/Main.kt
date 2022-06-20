import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val cards = List(20000002) {0}.toMutableList()
	val sb = StringBuilder()

	val n = br.readLine().toInt()
	br.readLine().split(" ").forEach { cards[it.toInt() + 10000000] += 1}
	val m = br.readLine().toInt()
	br.readLine().split(" ").forEach { sb.append("${cards[it.toInt() + 10000000]} ") }

	println(sb.toString())
}

//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//	readLine()
//	val haveCard = readLine().split(" ").map { it.toInt() }
//	val M = readLine().toInt()
//	val searchCard = readLine().split(" ").map { it.toInt() }
//	val ans = Array(M) { 0 }
//
//	for (i in haveCard) {
//		searchCard.forEachIndexed { index, j ->
//			if (i == j) {
//				ans[index]++
//			}
//		}
//	}
//
//	println(ans.joinToString(" "))
//}

