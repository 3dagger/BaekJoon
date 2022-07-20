import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
	val br = BufferedReader(InputStreamReader(System.`in`))
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	val T = br.readLine().toInt()
	var maxSpeed = 0
	var mySpeed = 0
	var competitor = 0.0

	for (i in 0 until T) {
		// N = 인원수, X = 트랙 길이, Y = 속도 임계치
		val (N, X, Y) = br.readLine()
			.split(" ")
			.map { it.toInt() }
		val vList = br.readLine()
			.split(" ")
			.map { it.toInt() }
			.toMutableList()

		// 나의 속도
		mySpeed = vList.removeLast()
//		bw.write("mySpeed :: $mySpeed\n")
		// 나를 제외한 최고 속도를 구하기위한 Sorting
		vList.sortDescending()
		// 나를 제외한 최고 속도
		maxSpeed = vList.first()
		// 경쟁자의 도달 시간
		competitor = (X.toDouble() / maxSpeed.toDouble())

//		bw.write("1 + 1.0 * ((X - Y) / mySpeed) :: ${1 + 1.0 * ((X - Y) / mySpeed)}")
//		bw.write("competitor :: $competitor\n")

		// 부스트를 안쓰고 이기면
		if (mySpeed > maxSpeed) {
			bw.write("0\n")
		} else if (1 + ((X.toDouble() - Y.toDouble()) / mySpeed) >= competitor) {
			bw.write("-1\n")
		} else {
			var low = 0
			var mid = 0
			var high = Y

			while (true) {
				if (low > high) break
				mid = (low + high) / 2
				val mt = 1 + 1.0 * (X - mid) / mySpeed

				when {
					mt >= competitor -> low = mid + 1
					mt < competitor -> high = mid - 1
				}
			}
			bw.write("$low\n")
		}
}

	bw.flush()
	bw.close()
	br.close()
}

val src = "5\n" +
		"3 12 11\n" +
		"3 2 1\n" +
		"3 12 9\n" +
		"3 2 1\n" +
		"3 12 10\n" +
		"3 4 5\n" +
		"3 80 80\n" +
		"80 60 70\n" +
		"3 80 80\n" +
		"70 50 60"