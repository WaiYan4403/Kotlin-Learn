fun main() {
    val numbers = listOf(0,2,3,1,1,4,5,6,7,8,8,2,3,5)
    println("list: ${numbers}")
    println("Sorted List: ${numbers.sorted()}")

    val setOfNumbers = numbers.toSet()
    println("set: ${setOfNumbers}")
    println("contains 7: ${setOfNumbers.contains(7)}")

    //map or dictionary
    val books = mutableMapOf<String, String>(
        "Chess" to "Linkin",
        "Kotlin Basic Guide" to "Google Devs"
    )
    println(books)
    books.put("Cooking Guide" , "Joe")
    println(books)

    //books["Chess"] = "Google"
    books["Android Basic"] = "Google Devs"
    println(books)

    //it = object
    //this = class
    books.forEach {
        print("${it.key} by ${it.value} \n")
    }
    println(
        books.map{
            "${it.key} by ${it.value}"
        }.joinToString(", \n")
    )

    //filter
    var filterBooks = books.filter { it.key.length < 6 }
    println(filterBooks)
    filterBooks = books.filter { it.key.startsWith("K") }
    println(filterBooks)
    filterBooks = books.filter { it.key.contains("Guide") }
    println(filterBooks)
}