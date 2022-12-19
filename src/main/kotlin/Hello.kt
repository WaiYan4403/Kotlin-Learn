fun main() {
    println("Hello!")

    //Variables
    var apple = 4
    var str = "Apple"
    var result: Double = 4.5

    //Constant
    val app = 44

    println("Result: $result")
    result.toInt()

    var number = 6
    var num = when(number){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        in 5..10 -> "6 to 10 in the range"
        else -> "invalid number"
    }

    println(num)
}