import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()){
	val (P, K) = readLine().split(" ")
	val k = K.toInt()
	val bw = BufferedWriter(OutputStreamWriter(System.out))

	var pNum = BooleanArray(1_000_000) { false }
	var isGood = true
	var answer = 0

	for (i in 2 until k) {
		if (pNum[i]) continue
		if (isCheck(i, P)) {
			isGood = false
			answer = i
			break
		}

		for (j in i * 2 until k step i) pNum[j] = true
	}

	if (isGood) {
		bw.write("GOOD")
	} else {
		bw.write("BAD $answer")
	}

	bw.flush()
	bw.close()
}

fun isCheck(pNum: Int, p: String): Boolean {
	var sum = 0
	for (i in p) {
		sum = ((sum * 10) + (i - '0')) % pNum
	}
	return sum == 0
}