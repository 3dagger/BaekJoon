import java.util.Stack

fun main() {
	val stack: Stack<Int> = Stack()
	repeat(readLine()!!.toInt()) {
		readLine()!!.toInt().let { if(it == 0) stack.pop() else stack.push(it)}
	}
	println(stack.sum())
}