import java.util.Collections
import java.util.LinkedList
import java.util.PriorityQueue
import java.util.Queue

fun main() {
	repeat(readLine()!!.toInt()) {
		val (a, b) = readLine()!!.split(" ").let { it[0].toInt() to it[1].toInt() }
		val queue: Queue<Pair<Int, Int>> = LinkedList()
		val pQueue: PriorityQueue<Int> = PriorityQueue(Collections.reverseOrder())
		var count = 0

		val priority = readLine()!!.split(" ").map { it.toInt() }

		(0 until a).forEach {
			queue.offer(it to priority[it])
			pQueue.offer(priority[it])
		}

		while (queue.isNotEmpty()) {
			val poll = queue.poll()
			if(poll.second == pQueue.peek()) {
				count++
				pQueue.poll()
				if(poll.first == b) {
					break
				}
			}else {
				queue.offer(poll)
			}
		}
		println(count)
	}
}