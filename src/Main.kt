fun main() {
    println("Hello World")

    val wholeNumber = 3 //Int.
    val bigNumber = 3L //Long.
    val preciseDecimal = 3.33 //Double.
    val decimal = 3.33f //Float.
    val character = 'c'
    //Booleans.
    val isItRaining = true
    val isItTimeToSleep = false

    println(isItRaining || isItTimeToSleep) //&& , ||

    var x: Int = 32 //Use 'val' for CONSTANTS. var x = 32
    println("The Value of x is: $x")
    x = 10000
    println("x has changed to: $x")

    var sum = 10+3 // +-*/

    //Important for Kotlin.
    println(3/4)
    println(3f/4f)
}