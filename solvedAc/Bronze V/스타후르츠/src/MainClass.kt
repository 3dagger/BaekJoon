class MainClass {
}

// 여름의 일 수
// 자라는데 걸리는 일 수
// 심을 수 있는 칸의 수
// 개당 가격 정보
// N, T, C, P
// 7, 3, 2, 750
// 60, 10, 300, 1000
// 여름의 일수 와 자라는데 걸리는 일 수의 나머지가 0 이면 일수 - 1 -> (N - 1)
// (N / T) * C * P
// 여름동안 스타후르츠를 팔아 벌 수 있는 수익을 Print
fun main() = readLine()!!.split(" ").let { if(it[0].toInt() % it[1].toInt() == 0) println((it[0].toInt() -1) / it[1].toInt() * it[2].toInt() * it[3].toInt()) else println((it[0].toInt() / it[1].toInt()) * it[2].toInt() * it[3].toInt()) }
