fun main() {
	val triangle = List(3) { readLine()!!.toInt() }
	if(triangle.sum() != 180) {
		println("Error")
	}else if(triangle.count { it == 60 } == 3) {
		println("Equilateral")
	}else if(triangle.distinct().size == 2) {
		println("Isosceles")
	}else {
		println("Scalene")
	}
}