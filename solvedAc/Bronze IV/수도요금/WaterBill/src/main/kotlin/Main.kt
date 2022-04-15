import kotlin.math.min
fun main() {
	val A = readLine()!!.toInt()
	val B = readLine()!!.toInt()
	val C = readLine()!!.toInt()
	val D = readLine()!!.toInt()
	val P = readLine()!!.toInt()
	val xCompanyPrice = A * P
	val yCompanyPrice = if(P <= C) { B } else { B + ((P - C) * D) }
	println(min(yCompanyPrice, xCompanyPrice))
}