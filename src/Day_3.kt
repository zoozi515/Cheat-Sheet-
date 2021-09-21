import kotlin.random.Random

fun main() {
    //#1. Dictionaries
    val seats = mapOf(1 to "Sara", 2 to "Jim", 3 to "Jane")
    println(seats[2])  // --> Jim
    println(seats[0])  // --> null

    println(seats.getOrDefault(0, "My Default Name"))  // --> My Default Name

    println(seats.containsKey(1))  // --> true

    println(seats.containsValue("Bob"))  // --> false

    val seats2 = mutableMapOf(1 to "Sara", 2 to "Jim", 3 to "Jane")
    println(seats2[2])  // --> Jim
    println(seats2[0])  // --> null
    seats2[0] = "Fred"
    println(seats2[0])  // --> Fred


    //#2 OOP in Kotlin
    /*a) Creating Class with Parameters and Instance*/
    class Person(val name: String){
        fun introduction(){
            println("Hi, my name is $name")
        }
    }
    Person("Tom").introduction()  // --> Hi, my name is Tom
    Person("Sara").introduction()  // --> Hi, my name is Sara

    /*b) Creating Class without Parameters and Instance*/
    class Car{
        var color = ""
        init {
            val colors = listOf("Red", "Blue", "Green", "Yellow")
            color = colors[Random.nextInt(colors.size)]  // --> colors.size is 4 in this case
        }
    }
    val myCar = Car()
    println(myCar.color)  // --> This will print the random color assigned to our car
    myCar.color = "Silver"
    println(myCar.color)  // --> Silver

    /*c)  Create an Abstract Class*/
    abstract class Vehicle{
        var color = "Blue"
        abstract fun doors()
    }
    class FamilyCar: Vehicle(){
        override fun doors() {
            println("This car has 4 doors")
        }
    }
    class SportsCar: Vehicle(){
        override fun doors() {
            println("This car has 2 doors")
        }
    }
    FamilyCar().doors()  // --> This car has 4 doors
    println("The family car is ${FamilyCar().color}.")  // --> The family car is Blue.
    val mySportsCar = SportsCar()
    mySportsCar.doors()  // --> This car has 2 doors
    mySportsCar.color = "Red"
    println("The color of my sports car is ${mySportsCar.color}.")  // --> The color of my sports car is Red.






}

