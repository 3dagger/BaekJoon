class MainClass {
}

fun main() {
	val rl = readLine()!!.split(" ")
	val a = rl[0].toInt()
	val b = rl[1].toInt()
	val c = rl[2].toInt()

	if(a == b && a == c) {
		print("${10000 + a * 1000}")
	}else if(a == b || b == c || a == c) {
		if(a == b) {
			print("${1000 + a * 100}")
		}else {
			print("${1000 + c * 100}")
		}
	}else {
		if(a > b && a > c) {
			print("${a * 100}")
		}else if(b > c){
			print("${b * 100}")
		}else {
			print("${c * 100}")
		}
	}
}