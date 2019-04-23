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
    var food = "fasting"

    when(day) {
        "Sunday" -> food = "flakes"
        "Monday" -> food = "pellets"
        "Tuesday" -> food = "redworms"
        "Wednesday" -> food = "granules"
        "Thursday" -> food = "mosquitoes"
        "Friday" -> food = "lettuce"
        "Saturday" -> food = "plankton"
    }

    return food
}

fun randomDay() : String {
    val weeks = listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    return weeks[Random().nextInt(7)]
}
