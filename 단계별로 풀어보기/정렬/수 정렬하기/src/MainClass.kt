import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

class MainClass {
}

// Collection 확장함수 사용한 풀이
//fun main() {
// List(readLine()!!.toInt()) { readLine()!!.toInt() }.sorted().map { println(it) }
// }

// Collection 확장함수 쓰지 않은 풀이 우선순위 큐 이용
fun main() {
	val br = System.`in`.bufferedReader()
	val bw = System.out.bufferedWriter()
	val pq = PriorityQueue<Int>()
	val sb = StringBuilder()

	repeat(br.readLine().toInt()) {
		pq.offer(br.readLine().toInt())
	}

	while (pq.isNotEmpty()) {
		sb.append("${pq.poll()}\n")
	}
	bw.write("$sb")
	bw.close()
	br.close()
}
