fun main() {
	val chartList = mutableListOf<Double>()
	repeat(2) {
		readLine()!!.split(" ")
			.map { chartList.add(it.toDouble()) }
	}

	val compareList = mutableListOf<Double>()
	val zero = (chartList[0] / chartList[2]) + (chartList[1] / chartList[3])
	val one = (chartList[2] / chartList[3]) + (chartList[0] / chartList[1])
	val two = (chartList[3] / chartList[1]) + (chartList[2] / chartList[0])
	val three = (chartList[1] / chartList[0]) + (chartList[3] / chartList[2])

	compareList.run {
		add(zero)
		add(one)
		add(two)
		add(three)
	}

	when (compareList.maxOf { it }) {
		zero -> println(0)
		one -> println(1)
		two -> println(2)
		three -> println(3)
	}

}