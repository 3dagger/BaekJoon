import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.min

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))

	val list = br
		.readLine()
		.split(" ")
		.map { it.toInt() }
		.sorted()

	val one = abs(list[0] - list[1])
	val two = abs(list[2] - list[1])

	if (one == two) {
		println(list[2] + (list[2] - list[1]))
	} else {
		val min = min(one, two)

		for (i in 0 until 3) {
			if (i != 2 && list[i] + min != list[i + 1]) {
				println(list[i] + min)
				break
			}
		}
	}
}