fun main() {
	var ball = 1
	repeat(readLine()!!.toInt()) {
		val yabawi = readLine()!!.split(" ").map { it.toInt() }

		if (yabawi[0] == ball || yabawi[1] == ball) {
			when (ball) {
				yabawi[0] -> ball = yabawi[1]
				yabawi[1] -> ball = yabawi[0]
			}
		}
	}
	println(ball)
}