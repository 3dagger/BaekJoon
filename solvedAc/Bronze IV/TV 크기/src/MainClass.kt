import kotlin.math.floor
import kotlin.math.sqrt

class MainClass {
}

// 비례상수를 이용해서 풀어야 함
// 화면 비율이 x:y 일때 가로세로의 크기를 각각 w,h 라 하면
// w = xz, h = yz (z는 비례상수)
fun main() {
	val (d, h, w) = readLine()!!.split(" ").let { Triple(it[0].toFloat(), it[1].toFloat(), it[2].toFloat()) }
	println("${floor(d * h / sqrt(h * h + w * w)).toInt()} ${floor(d * w / sqrt(h * h + w * w)).toInt()}")
}