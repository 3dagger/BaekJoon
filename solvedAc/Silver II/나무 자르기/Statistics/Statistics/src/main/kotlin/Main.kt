import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.roundToInt

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val N = br.readLine().toInt()
	val list = mutableListOf<Int>()
	repeat(N) {
		list.add(br.readLine().toInt())
	}

	list.sort()
	bw.write("${list.average().roundToInt()}\n")
	bw.write("${list[(list.size / 2)]}\n")
	bw.write("${getFreq(list)}\n")
	bw.write("${list.maxOf { it } - list.minOf { it }}")
	bw.flush()
	bw.close()
}

fun getFreq(list: MutableList<Int>): Int {
	val freqMap = list.groupingBy { it }.eachCount()
	val maxValue = freqMap.maxOf { it.value }
	val maxFreqMap = freqMap.filter { it.value == maxValue }
	val mapKeys = maxFreqMap.keys.sorted()

	return if (mapKeys.size == 1) {
		mapKeys.first()
	} else {
		mapKeys[1]
	}
}