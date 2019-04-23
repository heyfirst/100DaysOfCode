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
    println("swimming $speed in $time")
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
) : Boolean {
    
    val isTooHot = temperature > 30
    val isTooDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot -> true
        isTooDirty -> true
        isSunday -> true
        else -> false
    }
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

