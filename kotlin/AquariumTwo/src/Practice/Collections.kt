package Practice

fun main(args: Array<String>) {
    val symptoms = mutableListOf<String>("white spot", "red spots", "not eating")

    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    println(symptoms.contains("red")) // false
    println(symptoms.contains("red spots")) // true

    println(symptoms.subList(2, symptoms.size))

    println(listOf(1,2,3,4,5,6,7,8,9,10).sum())

    println(listOf("a", "b", "ccc").sumBy { it.length })

    //--------------------------------

    val cures = mapOf<String, String>("white spots" to "Ict", "red sores" to "hole disease")

    println(cures.get("white spots"))
    println(cures["white spots"])

    println(cures.getOrDefault("white spots!", "Sorry I don't know"))

    println(cures.getOrElse("white spots!") { "No!" })


    val inventory = mutableMapOf<String, String>("x" to "y", "1" to "2")
    inventory.put("z","Hello")
    inventory.remove("z")

    // Set!

    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val library = mapOf("Shakespeare" to allBooks)
    println(library.any { it.value.contains("Hamlet") }) // Search !

    val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }
    println(moreBooks)
}


