object SingletonBooks {
    init {
        println("Welcome To Book Store ----> Available Books are:")
    }

    var bookName = "Learn Kotlin"

    fun availableBook() {
        println(bookName)
    }
}

class Books {
    init {
        SingletonBooks.availableBook()
    }
}

fun main() {
    SingletonBooks.availableBook()
    SingletonBooks.bookName = "Learn Java"

    val b = Books()
}