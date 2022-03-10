class MainClass {
}

fun main() {
	val list = mutableListOf<Int>()
	var a = 1
	var cnt = 0
	val str = readLine()!!.toInt()

	var res = 0
	list.add(a)
	while (true) {
		cnt++
		a += 6 * cnt
		list.add(a)

		if(str == 1) {
			res = 1
		}else {
			list.forEachIndexed { index, i ->
				(a..i).forEach {
					if(str <= i) res = cnt + 1
				}
			}
		}

		if(res != 0 ){
			println(res)
			break
		}
	}
}

// 1 6 12 18 24 30 36 42 48 54
//  5 6