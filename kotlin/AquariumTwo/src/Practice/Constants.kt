package Practice

const val rocks = 3

val number = 5

const val num = 5

class MyClass {
    companion object {
        const val BASE_URL = "http://www.turtlecare.net/"
    }

    fun printUrl () {
        println(BASE_URL)
    }
}

const val MAX_NUMBER_BOOKS = 20

fun canBorrow(hasBooks: Int): Boolean {
    return (hasBooks < MAX_NUMBER_BOOKS)
}

object Constants {
    const val BASE_URL = "http://www.turtlecare.net/"
}

fun printUrl(title: String) {
    println(Constants.BASE_URL + title + ".html")
}
