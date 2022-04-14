fun main() {
	val n = readLine()!!.toInt()
	val arr = arrayListOf<Pair<Int, Int>>()
	val rank = IntArray(n) {1}

	repeat(n) {
		readLine()!!.split(" ").let { arr.add(Pair(it[0].toInt(), it[1].toInt())) }
	}

	repeat(n) { it1 ->
		repeat(n) { it2 ->
			if(arr[it1].first > arr[it2].first && arr[it1].second > arr[it2].second) {
				rank[it2]++
			}
		}
	}

	println(rank.joinToString(separator = " ", prefix = "", postfix = ""))
}

