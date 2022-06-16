fun main() {
	val (K, N) = readLine()!!.split(" ").map { it.toInt() }
	val arr = Array(K) { 0 }
	var min: Long = 1
	var mid: Long

	for (i in 0 until K) {
		arr[i] = readLine()!!.toInt()
	}

	arr.sort()

	var max: Long = arr[K - 1].toLong()

	while (min <= max) {
		mid = (min + max) / 2

		var count = 0L

		for (i in 0 until K) {
			count += arr[i] / mid
		}

		if (count >= N) {
			min = mid + 1
		} else {
			max = mid - 1
		}
	}
	println(max)
}