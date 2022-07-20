import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*


class Main {
	@Throws(Exception::class)
	private fun solution() {
		val br = BufferedReader(InputStreamReader(System.`in`))
		var st = StringTokenizer(br.readLine())
		var n = st.nextToken().toInt()
		val t = st.nextToken().toInt()
		var answer = Int.MAX_VALUE
		while (n-- > 0) {
			st = StringTokenizer(br.readLine())
			var s = st.nextToken().toInt()
			val i = st.nextToken().toInt()
			var c = st.nextToken().toInt()
			while (s < t && --c > 0 && s < answer) s += i
			if (s >= t) answer = s.coerceAtMost(answer)
		}
		println(if (answer == Int.MAX_VALUE) -1 else answer - t)
	}

	companion object {
		@Throws(Exception::class)
		@JvmStatic
		fun main(args: Array<String>) {
			Main().solution()
		}
	}
}