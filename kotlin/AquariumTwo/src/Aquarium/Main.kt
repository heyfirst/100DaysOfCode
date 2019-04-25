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

    val newAquarium = Aquarium(width = 120, height = 50, length = 80)
    println("NEWA :Height ${newAquarium.height}, Width ${newAquarium.width}, Length ${newAquarium.length}, Volume: ${newAquarium.volume}")

    val newAquarium2 = Aquarium(numberOfFish = 9)
    println("NEWA2: Height ${newAquarium2.height}, Width ${newAquarium2.width}, Length ${newAquarium2.length}, Volume: ${newAquarium2.volume}")

}