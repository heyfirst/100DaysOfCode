import java.util.*

fun main(args: Array<String>) {
    feedTheFish()
    eagerExample()
}

fun eagerExample() {
    val decorators = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    println("----------------- Filter -------------------")
    val eager = decorators.filter { it[0] == 'p'}
    println(eager)

    println("----------------- Lazy Filter -------------------")
    val lazyEager = decorators.asSequence().filter { it[0] == 'p'}
    println(lazyEager)
    println(lazyEager.toList())

    println("----------------- LazyMap -------------------")

    val lazyMapEager = decorators.asSequence().map {
        println("map: $it")
        it
    }
    println(lazyMapEager.first())
    println(lazyMapEager.toList())
    println(lazyMapEager)

    println("----------------- Apply -------------------")
    val sortedEager = decorators
        .filter { it.contains("o") }
        .sortedBy { it.length }

    println(sortedEager)

    val sortedTakeEager = decorators.take(3)
        .filter { it.contains("o") }
        .sortedBy { it.length }

    println(sortedTakeEager)

}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the first eat $food.")

    if(shouldChangeWater(day)) {
        println("Change  the water today.")
    }

    swim(50, speed="slow")
}

fun swim(time: Int, speed: String = "fast") {
    println("swimming $speed in $time")
}

fun getDirtyFromSensor() = 20

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = getDirtyFromSensor()
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

var dirty = 20

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
fun feedFish(dirty: Int) = dirty + 20

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty, { dirty -> dirty + 50 })
}