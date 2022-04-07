import java.util.StringTokenizer

fun main() {
	val deque: ArrayDeque<Int> = ArrayDeque()
	val sb = StringBuilder()
	repeat(readLine()!!.toInt()) {
		val st = StringTokenizer(readLine())
		when (st.nextToken()) {
			"push_front" -> { deque.addFirst(st.nextToken().toInt()) }
			"push_back" -> { deque.addLast(st.nextToken().toInt()) }
			"pop_front" -> { if(deque.isEmpty()) sb.append("-1\n") else sb.append("${deque.removeFirst()}\n")}
			"pop_back" -> { if(deque.isEmpty()) sb.append("-1\n") else sb.append("${deque.removeLast()}\n") }
			"size" -> { sb.append("${deque.size}\n") }
			"empty" -> { if(deque.isEmpty()) sb.append("1\n") else sb.append("0\n")}
			"front" -> { if(deque.isEmpty()) sb.append("-1\n") else sb.append("${deque.first()}\n")}
			"back" -> { if(deque.isEmpty()) sb.append("-1\n") else sb.append("${deque.last()}\n") }
		}
	}
	println(sb.toString())
}