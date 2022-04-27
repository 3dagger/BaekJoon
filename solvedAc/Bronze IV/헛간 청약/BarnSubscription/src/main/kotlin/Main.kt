fun main() {
	val (N, W, H, L) = readLine()!!.split(" ").map { it.toInt() }
	if((W / L) * (H / L) >= N) {
		println(N)
	}else {
		println((W / L) * (H / L))
	}
}