fun main() {
	var res = ""
	repeat(readLine()!!.toInt()) {
		val n = readLine()!!.toInt()
		val list = MutableList(n) { n }

		list.forEachIndexed { index, i ->
			if (index == 0 || index == list.size - 1) {
				repeat(i) {
					res += "#"
				}
				res += "\n"
			} else {
				repeat(i) {
					res += if (it == 0 || it == i - 1) {
						"#"
					} else {
						"J"
					}
				}
				res += "\n"
			}
		}
		res += "\n"
	}
	println(res)
}