package Practice

val waterFilter = { dirty: Int -> dirty / 30 }

data class Fish(val name: String)

val fishs = listOf<Fish>(Fish(name="Mathew"), Fish(name="John"), Fish(name="Doe"))

fun main(args: Array<String>) {
    val listOfFishName: String = fishs.filter { it.name.contains("o") }.joinToString(", ") { it.name }
    println(listOfFishName)
}