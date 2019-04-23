import java.util.*

fun main(args: Array<String>) {
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println("Today is $day and the first eat $food")
}

fun fishFood(day : String) : String {
    return when (day) {
        "Sunday" -> "flakes"
        "Monday" -> "pellets"
        "Tuesday" -> "redworms"
        "Wednesday" -> "granules"
        "Thursday" -> "mosquitoes"
        "Friday" -> "lettuce"
        "Saturday" -> "plankton"
        else -> "fasting"
    }
}

fun randomDay() : String {
    val weeks = listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    return weeks[Random().nextInt(7)]
}
