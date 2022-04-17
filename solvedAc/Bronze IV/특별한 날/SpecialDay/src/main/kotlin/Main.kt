fun main() {
	val (month, day) = List(2) {readLine()!!.toInt() }.let { it[0] to it[1] }

	if(month < 2) {
		println("Before")
	}else if(month <= 2 && day <= 17){
		println("Before")
	}else if(month == 2 && day == 18) {
		println("Special")
	}else {
		println("After")
	}
}