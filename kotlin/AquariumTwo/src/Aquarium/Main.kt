package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Height ${myAquarium.height}, Width ${myAquarium.width}, Length ${myAquarium.length}")

    myAquarium.height = 80
    println("Height: ${myAquarium.height}")

    println("Volume: ${myAquarium.volume} Liters")

}