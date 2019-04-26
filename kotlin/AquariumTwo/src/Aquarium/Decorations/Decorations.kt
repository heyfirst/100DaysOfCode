package Aquarium.Decorations

fun main (args: Array<String>) {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decoration(rocks="granite")
    println(d1)

    val d2 = Decoration(rocks="slate")
    println(d2)

    val d3 = Decoration(rocks="slate")
    println(d3)

    println(d2.equals(d3))

    val d4 = d3.copy()
    println(d3)
    println(d4)

    val d5 = Decoration2("crystal", "wood", "driver")
    println(d5)

    val (rock) = d5
    println(rock)
}

data class Decoration(val rocks: String)

data class Decoration2(val rocks: String, val wood: String, val diver: String)