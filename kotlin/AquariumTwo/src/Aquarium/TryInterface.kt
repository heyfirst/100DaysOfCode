package Aquarium

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val peco = Plecostomus2()
    println("Fish color is ${peco.color}")
    peco.eat()

    val peco2 = Plecostomus3(RedColor)
    println("Fish color is ${peco2.color}")
    peco2.eat()
}

interface FistAction {
    fun eat()
}

interface FishColor {
    val color: String
}

class Plecostomus2:
    FishAction by PrintingFishEat(food="nuts"),
    FishColor by GoldColor

class Plecostomus3(fishColor: FishColor):
    FishAction by PrintingFishEat(food="nuts"),
    FishColor by fishColor

object GoldColor: FishColor {
    override val color: String
        get() = "gold"
}

object RedColor: FishColor {
    override val color: String
        get() = "red"
}

class PrintingFishEat(val food: String): FishAction {
    override fun eat() {
        print(food)
    }
}