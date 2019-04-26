package Aquarium

abstract class AquariumFish {
    abstract val color: String
}

class Shark : AquariumFish(), FishAction {
    override val color: String = "Gray"

    override fun eat() {
        println("Eat yayaya ~!")
    }
}

class Plecostomus : AquariumFish(), FishAction {
    override val color: String = "Gold"

    override fun eat() {
        println("Eat wowowo ~")
    }
}

interface FishAction {
    fun eat()
}