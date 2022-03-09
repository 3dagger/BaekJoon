class MainClass {
}

fun main(){
	val m= readLine()!!
	repeat(26){
		print("${m.indexOf('a'+it)} ")
	}
}

//fun main() {
//	val rl = readLine()!!
//	val alphabet = mutableMapOf(
//		"a" to "-1",
//		"b" to "-1",
//		"c" to "-1",
//		"d" to "-1",
//		"e" to "-1",
//		"f" to "-1",
//		"g" to "-1",
//		"h" to "-1",
//		"i" to "-1",
//		"j" to "-1",
//		"k" to "-1",
//		"l" to "-1",
//		"m" to "-1",
//		"n" to "-1",
//		"o" to "-1",
//		"p" to "-1",
//		"q" to "-1",
//		"r" to "-1",
//		"s" to "-1",
//		"t" to "-1",
//		"u" to "-1",
//		"v" to "-1",
//		"w" to "-1",
//		"x" to "-1",
//		"y" to "-1",
//		"z" to "-1",
//	)
//
//	rl.forEachIndexed { index, it ->
//		alphabet.map { (key, _) ->
//			if(it.toString() == key) {
//				if(!isChange(alphabet[key]!!)) alphabet[key] = index.toString()
//			}
//		}
//	}
//
//	print(alphabet.values.joinToString().replace(",", ""))
//}
//
//fun isChange(value: String) : Boolean {
//	return value != "-1"
//}