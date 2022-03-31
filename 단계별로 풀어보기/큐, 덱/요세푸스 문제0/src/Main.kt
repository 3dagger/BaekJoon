import java.util.*
fun main() {
	val (a, b) = readLine()!!.split(" ").let { it[0].toInt() to it[1].toInt() }
	val arr = mutableListOf<Int>()
	val queue: Queue<Int> = LinkedList()
	(1..a).forEach { queue.offer(it) }
	while (queue.isNotEmpty()) {
		repeat(b - 1) {
			val poll = queue.poll()
			queue.offer(poll)
		}
		val rm = queue.remove()
		arr.add(rm)
	}
	println("<${arr.joinToString()}>")
}
