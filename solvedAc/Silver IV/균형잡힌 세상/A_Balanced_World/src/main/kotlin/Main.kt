import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	while (true) {
		val str = br.readLine()
		if (str == ".") {
			break
		}

		var isBalanced = true
		val stack = Stack<Char>()

		str.forEach {
			if (it == '('  || it == '[') {
				stack.push(it)
			} else if (it == ')') {
				if (!stack.empty() && stack.peek() == '(') {
					stack.pop()
				} else {
					isBalanced = false
					return@forEach
				}
			} else if (it == ']') {
				if (!stack.empty() && stack.peek() == '[') {
					stack.pop()
				} else {
					isBalanced = false
					return@forEach
				}
			}
		}

		if (stack.isNotEmpty()) {
			isBalanced = false
		}

		when (isBalanced) {
			true -> bw.write("yes\n")
			false -> bw.write("no\n")
		}
	}

	bw.flush()
	bw.close()
}