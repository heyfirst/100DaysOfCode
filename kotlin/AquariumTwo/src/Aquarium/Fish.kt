package Aquarium

class Fish (
    friendly: Boolean,
    volumeNeeded: Int
) {
    val size: Int

    init {
        if (friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }

}