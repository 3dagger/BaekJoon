class MainClass {
}

fun main() {
	List(3) { readLine()!!.split(" ").map { it.toInt() } }
		.forEach { calculateWorkingTime(it) }
}

fun calculateWorkingTime(employee : List<Int>) {
	var hourA = 0
	var minA = 0
	var secA = 0
	if(employee[5] >= employee[2] ) {
		secA = employee[5] - employee[2]

		if(employee[4] >= employee[1] ) {
			minA = employee[4] - employee[1]
			hourA = employee[3] - employee[0]
		}else {
			minA = employee[4] + 60 - employee[1]
			hourA = employee[3] - 1 - employee[0]
		}
	}else {
		secA = employee[5] + 60 - employee[2]

		if(employee[4] - 1 >= employee[1]) {
			minA = employee[4] - 1 - employee[1]
			hourA = employee[3] - employee[0]
		}else {
			minA = employee[4] - 1 + 60 - employee[1]
			hourA = employee[3] - 1 - employee[0]
		}
	}

	println("$hourA $minA $secA")
}