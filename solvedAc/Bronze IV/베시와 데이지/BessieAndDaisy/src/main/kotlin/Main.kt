import java.util.*
import kotlin.math.abs
import kotlin.math.max

// 베시는 8칸 중 하나로 이동가능(상, 하, 좌, 우, 좌우, 좌하, 우상, 우하)
// 데이지는 4칸 중 하나로 이동가능(상, 하, 좌, 우)
fun main() {
	val sc = Scanner(System.`in`)
	val bx = sc.nextInt()
	val by = sc.nextInt()
	val dx = sc.nextInt()
	val dy = sc.nextInt()
	val jx = sc.nextInt()
	val jy = sc.nextInt()

	val bessieTime = max(abs(bx - jx), abs(by - jy))
	val daisyTime = abs(dx - jx) + abs(dy - jy)

	when {
		daisyTime < bessieTime -> println("daisy")
		daisyTime > bessieTime -> println("bessie")
		else -> println("tie")
	}
}