fun main() {
	val (K, D, A) = readLine()!!.split("/").map { it.toInt() }
	if(K + A < D || D == 0) {
		println("hasu")
	}else {
		println("gosu")
	}
}