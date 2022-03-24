class MainClass {
}

fun main(){
	val(a,b)=readLine()!!.split(' ').map{it.toInt()}
	print(if(a<b||(a+b)%2!=0)-1 else "${(a+b)/2} ${(a-b)/2}")
}