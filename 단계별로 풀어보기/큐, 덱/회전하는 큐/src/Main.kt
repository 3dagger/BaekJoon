import java.util.LinkedList

// 큐의 크기, 뽑아내려고 하는 수
// 뽑아내려고 하는 수의 위치
// 2(큐의 왼쪽 헤더 뽑아서 오른쪽 삽입), 3(큐의 오른쪽 헤더 뽑아서 왼쪽 삽입) 연산의 최솟값을 출력
var count = 0
fun main() {
	val queue = LinkedList<Int>()
	val (a, b) = readLine()!!.split(" ").let { it[0].toInt() to it[1].toInt() }
	(1..a).forEach { queue.add(it) }
	var targetArr = readLine()!!.split(" ").map { it.toInt() }

	repeat(b) {
		val target = targetArr[it]
		when(queue.indexOf(target) <= queue.size / 2) {
			true -> {
				while (target != queue.first) {
					secondOperation(queue)
				}
			}
			false -> {
				while (target != queue.first) {
					thirdOperation(queue)
				}
			}
		}
		firstOperation(queue)
	}
	println(count)
}

private fun firstOperation(queue: LinkedList<Int>) : LinkedList<Int> {
	queue.poll()
	return queue
}

private fun secondOperation(queue: LinkedList<Int>) : LinkedList<Int> {
	val rmFirst = queue.removeFirst()
	queue.addLast(rmFirst)
	count++
	return queue
}

private fun thirdOperation(queue: LinkedList<Int>) : LinkedList<Int> {
	val rmLast = queue.removeLast()
	queue.addFirst(rmLast)
	count++
	return queue
}