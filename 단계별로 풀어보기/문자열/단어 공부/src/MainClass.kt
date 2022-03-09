import kotlin.math.max
import kotlin.time.Duration.Companion.seconds

class MainClass {
}

fun main() {
	val s = readLine()!!
	val counts = s.groupingBy { it.uppercase() }.eachCount()
	val max = counts.values.maxOf { it }
	counts.filterValues { it == max }
		.let { if (it.size > 1) println("?") else println(it.keys.first()) }
}
