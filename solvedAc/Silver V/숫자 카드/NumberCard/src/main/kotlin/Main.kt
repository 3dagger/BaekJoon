import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val N = br.readLine().toInt()
	val numberCard = br.readLine().split(" ").map { it.toInt() }.sorted().toIntArray()
	val M = br.readLine().toInt()
	val searchNumber = br.readLine().split(" ").map { it.toInt() }

	searchNumber.map {
		binarySearch(numberCard, it)
	}.also { bw.write(it.joinToString(" ")) }

	bw.flush()
	bw.close()
	br.close()
}

fun binarySearch(arr: IntArray, target: Int): Int {33
	var low = 0
	var high = arr.lastIndex
	var mid = 0
	// 최솟값이 최댓값 보다 작을때 반복
	while (low <= high) {
		// 중간값은 (최솟값 + 최댓값) / 2
		mid = (low + high) / 2
		when {
			// arr[mid] 값이 target 과 같으면  mid 를 반환
			arr[mid] == target -> return 1
			// arr[mid] 값이 target 보다 크다면 최댓값은 mid 값 - 1 -> 왼쪽으로 좁혀감
			arr[mid] > target -> high = mid - 1
			// arr[mid] 값이 target 보다 작다면 최솟값은 mid 값 + 1 -> 오른쪽으로 좁혀감
			else -> low = mid + 1
		}
	}

	return 0
}