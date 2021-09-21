import kotlin.collections.ArrayList as ArrayList1

fun main() {

    //#1. Function
    fun sayHi(){
        println("Hi")
    }
    println("One")
    println("Two")
    sayHi()  // --> Here we call our function
    println("Three")


    //#2. Arguments/Parameters
    fun greet(type: Int, name: String = "Bob"){
        if(type == 0){
            println("Happy Birthday $name!")
        }else{
            println("Congratulations $name!")
        }
    }
    greet(0, "Sara")  // --> Prints 'Happy Birthday Sara!'
    greet(1)  // --> Prints 'Congratulations Bob!'


    //#3. Returning Values
    fun add(num1: Int, num2: Int): Int{
        return num1 + num2
    }
    println(add(4, 7))  // --> 11

    //#4. Lists and Arrays
    /* Immutable Lists */
    val myList = listOf("Car", 15, false, 19, "Bike")
    println(myList[4])  // --> Bike
    //myList[0] = "Boat"  // --> Unresolved Reference Error
    println(myList.size)  // --> 5

    /* Mutable Lists */
    val myArray = arrayOf("Car", 15, false, 19, "Bike")
    println(myArray[2])  // --> false
    //myArray[0] = "Boat"  // --> This is fine, myArray[0] is now 'Boat'
    println(myArray.size)  // --> 5

    //#5. ArrayList
    val shoppingList = ArrayList1<String>()

    shoppingList.add("Eggs")
    shoppingList.add("Bread")
    shoppingList.add("Milk")
    shoppingList.add("Bananas")
    shoppingList[0] = "Butter"
    shoppingList.remove("Milk")
    shoppingList.add("Apples")

    for(item in shoppingList){
        println(item)
    }

    //#6. 2D ArrayLists
    /* val credentials = ArrayList1<>()

    credentials.add(ArrayList1(arrayListOf("user1", "12345")))
    credentials.add(ArrayList1(arrayListOf("user2", "password")))
    credentials.add(ArrayList1(arrayListOf("Bob", "00000")))
    credentials.add(ArrayList1(arrayListOf("Tim", "55555")))

    println(credentials[2][0])  // --> Bob
    println(credentials[0][1])  // --> 12345 */
}