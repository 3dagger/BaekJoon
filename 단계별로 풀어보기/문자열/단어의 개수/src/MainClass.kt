class MainClass {
}

//fun main() = readLine()!!.let { if(it.isBlank()) print("0") else print(it.trimStart().trimEnd().split(" ").size) }

/**
 * @author : 이수현
 * @Date : 2022/03/08 2:04 AM
 * @Description : 다른 사람 풀이
 * @History :
 *
 **/
fun main() {
	print(readLine()!!.split(" ").count{it!=""})
}
