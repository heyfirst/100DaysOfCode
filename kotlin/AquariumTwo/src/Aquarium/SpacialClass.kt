package Aquarium

object MobyDickWhale {
    val author = "Herman Melville"

    fun jump() {
        //..
    }
}

enum class (val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

sealed class Seal

class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        is SeaLion -> "Sea Lion"
        is Walrus -> "walrus"
    }
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}