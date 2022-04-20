fun main() {
	readLine()!!.split(" ").map { it.toInt() }.sorted().let {
	val firstTeamSkill = it[0] + it[3]
	val secondTeamSkill = it[1] + it[2]
		if(firstTeamSkill >= secondTeamSkill) {
			println(firstTeamSkill - secondTeamSkill)
		}else {
			println(secondTeamSkill - firstTeamSkill)
		}
	}
}