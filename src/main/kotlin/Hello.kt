fun main() {
    println("Hello!")

    //Variables
    var apple = 4
    var str = "Apple"
    var result: Double = 4.5

    //Constant
    val app = 44

    //String connection
    println("Result: $result")
    result.toInt()

    //When (Switch in java)
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

    //while,do while -> same with java
    //For loop
    for(i in 1..10){
        println(i)
    }

    //For loop with odd number
    // i + 2
    for(i in 1..10 step 2){
        println(i)
    }

    //Foreach loop
    var fruits = arrayOf("Apple","Orange","Pineapple","Guava")
    for(fruit in fruits){
        println(fruit)
    }
}