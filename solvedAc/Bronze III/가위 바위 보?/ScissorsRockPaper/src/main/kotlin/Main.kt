fun main() {
	var res = ""
	repeat(readLine()!!.toInt()) {
		var playerOne = 0
		var playerTwo = 0
		repeat(readLine()!!.toInt()) {
			readLine()!!.split(" ")
				.let {
					if (it[0] == "R" && it[1] == "S") {
						playerOne++
					} else if (it[0] == "R" && it[1] == "P") {
						playerTwo++
					} else if (it[0] == "R" && it[1] == "R") {
						playerOne++
						playerTwo++
					} else if (it[0] == "S" && it[1] == "R") {
						playerTwo++
					} else if (it[0] == "S" && it[1] == "P") {
						playerOne++
					} else if (it[0] == "S" && it[1] == "S") {
						playerOne++
						playerTwo++
					} else if (it[0] == "P" && it[1] == "R") {
						playerOne++
					} else if (it[0] == "P" && it[1] == "S") {
						playerTwo++
					} else {
						playerOne++
						playerTwo++
					}
				}
		}
		if (playerOne > playerTwo) {
			res += "Player 1"
		} else if (playerOne < playerTwo) {
			res += "Player 2"
		} else {
			res += "TIE"
		}
		res += "\n"
	}
	println(res)
}