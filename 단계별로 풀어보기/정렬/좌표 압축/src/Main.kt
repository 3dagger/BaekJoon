val br = System.`in`.bufferedReader()

fun main() =with(System.out.bufferedWriter()){

	val n = br.readLine().toInt()
	val arr = br.readLine().split(' ').map{it.toInt()}
	val sortedArr = arr.distinct().sorted()
	val hashMap = HashMap<Int,Int>()
	var idx=0
	sortedArr.forEach {
		hashMap[it]=idx++
	}

	for(i in 0 until n){
		write("${hashMap[arr[i]]} ")
	}

	close()
}