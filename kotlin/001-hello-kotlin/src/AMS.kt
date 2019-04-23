import java.util.*

fun main(args: Array<String>) {
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the first eat $food.")

    if(shouldChangeWater(day)) {
        println("Change the water today.")
    }

    swim(50, speed="slow")
}

fun swim(time: Int, speed: String = "fast") {
    println("swimming $speed")
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
) : Boolean {
    return true
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


fun canAddFish (
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true
): Boolean {
    return tankSize * if (hasDecorations) 0.8 else 1.0 >= (currentFish.sum() + fishSize)
}