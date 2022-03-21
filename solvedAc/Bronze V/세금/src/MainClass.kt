fun main() = readLine()!!.toInt().let { println("${(it - (it * 0.22)).toInt()} ${(it * 0.8).toInt() + ((it * 0.2).toInt() - ((it * 0.2) * 0.22).toInt())}") }
