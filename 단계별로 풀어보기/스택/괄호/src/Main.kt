import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
	var TC = readLine().toInt()
	repeat(TC) {
		val PS = readLine()
		var openCount = 0

		for (i in 0 until PS.length) {
			if (PS[i] == '(') openCount++
			else if (PS[i] == ')') openCount--

			//openCount 가 음수라면 닫는 괄호가 먼저 나왔다는 뜻
			if (openCount < 0) {
				println("NO")
				break
			}
			//괄호의 마지막일때
			if (i == PS.lastIndex) {
				//  0이라는 건 여닫는 괄호의 수가 짝이 맞다는 뜻
				if (openCount == 0) println("YES")
				else println("NO")  //아니라면 VPS가 아니다
			}
		}
	}
}