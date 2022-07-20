import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	// N = 버스의 갯수
	// T = 영식이 버스터미널에 도착하는 시간
	// S = 버스의 시작 시간
	// I = 버스 배차 간격
	// C = 버스 댓수
	val (N, T) = br.readLine().split(" ").map { it.toInt() }
	val bsTotalList = Array(N) { mutableListOf<Int>() }

	repeat(N) {
		val bsList = mutableListOf<Int>()
		val (S, I, C) = br.readLine().split(" ").map { it.toInt() }
		for (i in 0 until C) {
			bsList.add(S + (I * i))
		}
		bsTotalList[it] = bsList
	}

	val res = mutableListOf<Int>()
	bsTotalList.forEach {
		res.add(binarySearch(it, T))
	}

//	bw.write("${bsTotalList}\n")
	bw.write("${res}\n")

	bw.flush()
	bw.close()
	br.close()
	// 영식이가 기다려야하는 시간을 출력
	// 영식이가 도착하는 동시에 버스가 출발하면 0을 출력
	// 만약 버스가 없다면 -1 출력

	// 150 200 250 300 350 400 450 500 550 600
	// S + (S * I)
}

fun binarySearch(arr: MutableList<Int>, target: Int): Int {
	arr.sort()
	var low = 0
	var mid = 0
	var high = arr.lastIndex

	while (low <= high) {
		mid = (low + high) / 2

		when {
			arr[mid] == target -> return 0
			arr[mid] > target -> high = mid - 1
			else -> low = mid + 1
		}
	}
	return -1
}