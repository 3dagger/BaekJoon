fun main() {
	// 사이즈가 15인 2차원 배열 생성
	val apt2dArr = Array(15) {Array(15) {0} }

	// 0층 부터 14층 까지 초기화
	// 1호는 1로 모두 초기화
	// 0층의 호수는 1, 2, 3, ..., 14로 초기화
	(0..14).forEach {
		apt2dArr[it][1] = 1
		apt2dArr[0][it] = it
	}

	// 1층 부터 14층까지 반복
	// 2호 부터 14호까지 반복
	// 자신의 호수는 = 자신의 호수 -1 + 자신의 전층 호수
	(1..14).forEach { a ->
		(2..14).forEach { b ->
			apt2dArr[a][b] = apt2dArr[a-1][b] + apt2dArr[a][b-1]
		}
	}

	val tcCount = readLine()!!.toInt()
	var res = ""
	(1..tcCount).forEach {
		val k = readLine()!!.toInt()
		val n = readLine()!!.toInt()

		res += "${apt2dArr[k][n]}\n"
	}

	print(res)
}
