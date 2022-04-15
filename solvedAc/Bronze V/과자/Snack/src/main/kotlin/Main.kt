// 과자 한개의 가격 K
// 사려고 하는 과자의 개수 N
// 현재 가진 돈의 액수 M
// Result -> 동수가 부모님께 받아야하는 모자란 돈
fun main() {
	val (K, M, N) = readLine()!!.split(" ").let { Triple(it[0].toInt(), it[1].toInt(), it[2].toInt()) }
	if(K * M >= N) println(K * M - N) else println(0)
}