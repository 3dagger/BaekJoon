import java.util.LinkedList
import java.util.Queue

fun main() {
	val queue: Queue<Int> = LinkedList()
	(1..readLine()!!.toInt()).forEach { queue.offer(it) }

	while (queue.isNotEmpty()) {
		if(queue.size == 1) {
			print(queue.peek())
			break
		}
		queue.remove()
		val next = queue.poll()
		queue.offer(next)
	}
}