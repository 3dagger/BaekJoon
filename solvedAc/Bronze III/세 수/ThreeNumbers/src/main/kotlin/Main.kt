fun main() {
	readLine()!!.split(" ").map { it.toInt() }
		.also {
			if (it[0] == it[1] + it[2]) {
				println("${it[0]}=${it[1]}+${it[2]}")
			} else if (it[0] == it[1] - it[2]) {
				println("${it[0]}=${it[1]}-${it[2]}")
			} else if (it[0] == it[1] / it[2]) {
				println("${it[0]}=${it[1]}/${it[2]}")
			} else if (it[0] == it[1] * it[2]) {
				println("${it[0]}=${it[1]}*${it[2]}")
			} else if (it[0] + it[1] == it[2]) {
				println("${it[0]}+${it[1]}=${it[2]}")
			} else if (it[0] - it[1] == it[2]) {
				println("${it[0]}-${it[1]}=${it[2]}")
			} else if (it[0] / it[1] == it[2]) {
				println("${it[0]}/${it[1]}=${it[2]}")
			} else if (it[0] * it[1] == it[2]) {
				println("${it[0]}*${it[1]}=${it[2]}")
			}
		}
}