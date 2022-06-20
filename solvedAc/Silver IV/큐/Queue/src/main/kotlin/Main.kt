import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`)))  {
	val n = readLine().toInt()
	val queue: Queue<Int> = LinkedList()

	val bw = BufferedWriter(OutputStreamWriter(System.out))

	repeat(n) {
		val next = readLine().split(" ")
		when (next[0]) {
			"push" -> {
				queue.offer(next[1].toInt())
			}
			"pop" -> {
				if (queue.isEmpty()) {
					bw.append("-1\n")
				} else {
					bw.append("${queue.poll()}\n")
				}
			}
			"size" -> {
				bw.append("${queue.size}\n")
			}
			"empty" -> {
				if (queue.isEmpty()) bw.append("1\n") else bw.append("0\n")
			}
			"front" -> {
				if (queue.isEmpty()) {
					bw.append("-1\n")
				} else {
					bw.append("${queue.peek()}\n")
				}
			}
			"back" -> {
				if (queue.isEmpty()) {
					bw.append("-1\n")
				} else {
					bw.append("${queue.last()}\n")
				}
			}
		}
	}

	bw.flush()
	bw.close()

}
