import kotlin.random.Random

fun main() {
    //#1 - Print Statement
    print("Hello World - without new line ")
    println("Hello World")


    //#2 - User Input
    /* Immutable Variables - val keyword */
    val a: Int = 5
    val b = 5

    /* Mutable Variables - var keyword */
    var name: String = "Adam"
    name = "Jake"

    /*Read data from user*/
    val name_var = readLine()


    //#3- String
    /* Concatenation */
    val message_part1 = "Hi there, "
    val message_part2 = "user"
    val full_message = message_part1 + message_part2

    /* Interpolation*/
    val text_part1 = "Hi there,"
    val text_part2 = "user"
    val full_text = "$text_part1 $text_part2"

    //#4 - Data Type
    /*  Ex: int, float, boolean and String*/
    val num1: Int = 5
    val num2 = 5
    val num3: Float = 6f
    val num4 = 6f
    val name2: String = "Tom"
    val name3 = "Jane"
    val passed: Boolean = false
    val failed = true

    /* Mixed Datatype*/
    val numInt = 6
    val numFloat = 6f
    val sum = numFloat + numInt /* sum = 12.0 */
    var sum2 = 0
    // sum2 = numFloat + numInt  /* Type Mismatch Error */
    sum2 = (numFloat + numInt).toInt() /* sum = 12 */
    numFloat.toInt() /* numFloat = 6 */


    //#5 - Basic Operation
    var number = 10
    number = number + 1 /* number = 11 */
    number += 1 /* number = 12 */
    number /= 2 /* number = 6 */
    number ++ /* number = 7 */

    number *= 3 /* number = 21 */
    number -- /* number = 20 */
    number %= 3 /* number = 2 */
    //number = 10 / 0  /* Zero Division Error */


    //#6 - If Statement
    /*if your age is between 18 to 25,
    you allowed to register in Mobile Development Bootcamp */
    val age = readLine()!!.toInt()
    if(age < 18){
        println("You are not old enough, you are not allowed to register :(")  /* This would be true, the rest would be skipped */
    }else if(age <= 25){
        println("You can register :)")
    }else{
        println("You are too old, \nyou are not allowed to register :( ")
    }


    //#7 - Try Catch
    val num = 10
    print("Enter a number: ")
    try { /*To check whether the input is number, if not show the exception message*/
        val userNum = readLine()!!.toInt()
        val sum = num + userNum
        println(sum)
    } catch (e: Exception) {
        println("Please enter numbers only")
    }

    //#8 - For Loop
    /* Print numbers from 1 to 5 */
    for(number in 1..5){
        println(number)
    }

    /* Print (*) if letter a found in text */
    for (letter in full_message){
        if(letter == 'a'){
            println("*")
        }
    }

    //#9 - While Loop
    /* Print numbers from 1 to 5 */
    var count = 0
    while (count < 5){
        count ++
        println(count)
    }


    //#10 - When
    /* Check Student Grade*/
    val grade = readLine()!!.toInt()
    when {
        grade < 60 -> println("F")
        grade < 70 -> println("D")
        grade < 80 -> println("C")
        grade < 90 -> println("B")
        else -> println("A")
    }


    //#11 - Random Module
    /* Assign a random number between 0 and 10*/
    val randomNumber = Random.nextInt(11)

    /* Assign a random number between 7 and 14*/
    val randomNumber2 = Random.nextInt(7, 15)

}