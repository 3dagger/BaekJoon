import java.time.ZoneOffset
import java.time.ZonedDateTime

fun main() {
	val zoneOffset = ZoneOffset.of("+00:00")
	println(ZonedDateTime.now(zoneOffset).year)
	println(ZonedDateTime.now(zoneOffset).monthValue)
	println(ZonedDateTime.now(zoneOffset).dayOfMonth)
}