import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

// 세로 N, 가로 M, 블록 갯수 B
// 블록 제거 2초
// 블록 쌓기 1초

// 출력 '땅 고르기'작업에 걸리는 최소 시간과 그 경우 땅의 높이를 출력하시
/**
 * @author : 이수현
 * @Date : 2022/06/26 11:48 AM
 * @Description : 완전 탐색 문재
 * @History :
 *
 **/
fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val (N, M, B) = br.readLine().split(" ").map { it.toInt() }
	val land = mutableListOf<MutableList<Int>>()

	repeat(N) {
		br.readLine()
			.split(" ")
			.map { it.toInt() }
			.toMutableList()
			.also { land.add(it) }
	}

	var max = 0
	var min = 999999999
}