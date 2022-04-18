fun main() {
	val filterList = mutableListOf<Int>()
	List(4) { readLine()!!.toInt() }.sortedDescending().mapIndexed { index, i -> if(index <= 2) filterList.add(i) }
	filterList.add(List(2) { readLine()!!.toInt() }.maxOf { it })
	println(filterList.sum())
}