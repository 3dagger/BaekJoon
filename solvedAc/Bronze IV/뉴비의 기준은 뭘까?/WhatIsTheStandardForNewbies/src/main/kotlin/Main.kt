fun main() {
	val (oldbie, grade) = readLine()!!.split(" ").map { it.toInt() }
	if(grade == 1 || grade == 2) {
		println("NEWBIE!")
	}else if (grade <= oldbie) {
		println("OLDBIE!")
	}else {
		println("TLE!")
	}
}