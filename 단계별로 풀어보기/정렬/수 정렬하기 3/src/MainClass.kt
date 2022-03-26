import java.util.PriorityQueue

fun main() {
	val br = System.`in`.bufferedReader()
	val bw = System.out.bufferedWriter()
	val n: Int = br.readLine().toInt()
	val arr = IntArray(10001)

	repeat(n) {
		arr[br.readLine().toInt()]++
	}
	br.close()

	repeat(arr.size) {
		bw.write("$it\n".repeat(arr[it]))
	}
	bw.close()
}

//fun main() {
//	val br = System.`in`.bufferedReader()
//	val bw = System.out.bufferedWriter()
//	val pq = PriorityQueue<Int>()
//	val sb = StringBuilder()
//
//	repeat(br.readLine().toInt()) {
//		pq.offer(br.readLine().toInt())
//	}
//
//	while (pq.isNotEmpty()) {
//		sb.append("${pq.poll()}\n")
//	}
//
//	bw.write(sb.toString())
//	bw.close()
//	br.close()
//}