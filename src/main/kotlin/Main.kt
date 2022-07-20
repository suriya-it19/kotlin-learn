import java.util.Scanner

// no semicolon :)
// unit - void
// any - null

// open should be attached to allow it to be inherited else it cannot
// by default all class are final
// open classes cant be instantiated
open class CarForSale(name: String) {
    var modelNo = 5583
    var value = "mustang"
}

// constructor - no need of assignement, it automatically assigns
// if needed you can use init to make some changes if needed and assign
// another type is secondary constructor - that can be inside the class same as java
class CarValue(var brand: Int = "mustang", var model: String, var year: Int) : CarForSale("default") {
    fun speed(maxSpeed: Int) {
        println("Max speed for $value is: $maxSpeed")
    }
}

fun add(first: Int, second: Int): Int {
    return first + second
}

// the args to the main function is not necessary
fun main(args: Array<String>) {
    println("Hello World!")

    /* Try adding program arguments via Run/Debug configuration.
       Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    */

    // println is same as in java -> prints and moves to the next line
    println("first line")

    // print -> same line, cursor doesn't move
    print("hello")
    print(130)
    println()

    // variables - var or val
    // val - as constant cannot be changed; var - can be changed
    var name = "suriya"
    val age = 99

    // it automatically fits the data type as python
    // to explicitly mention
    var first: String = "suriya"
    val second: Int = 99 // reassignment will give an error

    // the variable can also be declared without initialization
    // but it must explicitly define the datatype else it's an error
    var temp: String
    temp = "hello"
    println(temp)

//    Names can contain letters, digits, underscores, and dollar signs
//    Names should start with a letter
//    Names can also begin with $ and _ (but we will not use it in this tutorial)
//    Names are case sensitive ("myVar" and "myvar" are different variables)
//    Names should start with a lowercase letter and it cannot contain whitespace(optional)
//    Reserved words (like Kotlin keywords, such as var or String) cannot be used as names

//    data type same as in java
//    byte, short, int, float, double, char, string
    var num: Int = 2147483647
    val Lnum: Long = 2147483648
    var flo = 9.99f // f or F
    var dou = 9.99
    var exp = 10e4 // scientific -> 10E4 or 10e4

    var ch = 'F'
    // var cha: Char = 8 -> error
//    println(cha)cha

//    To convert a numeric data type to another type, you must use one of the following functions:
//    toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():


    // Operators are same as java
    // =, +, -, *, %, /, +=, -=...., <, <=, !=, &&, !, ++, --...
    var x = 1
    x++


    var check: String
    check = "first"
    check = "Second"

    // error
//    val check1: String
//    check1 = "first"
//    check1 = "Second"

    // same as java strings,
    // to compare here .compareTo(), in java .equals()
    println(check.compareTo(temp))

    // + can be used to concatenate strings, but also .plus()
    // format in string
    var newString = "hello $name how are you"


    // if else
    val time = 22
    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }

    // automatically assign value using an expression
    // here else is a must
    val greeting = if (time < 18) {
        "Good day."
    } else {
        "Good evening."
    }

    val greeting1 = if (time < 18) "Good day." else "Good evening."


    // The when expression is similar to the switch statement in Java.
    val day = 4
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)



    // Loops are handy because they save time, reduce errors, and they make code more readable.
    // while, do-while, no traditional for loop - for each


    // arrays same as java
    val city = arrayOf("palo alto", "newyork", "california") // implicit datatype identification
    var numbers = arrayOf<Long>(456, 564, 654, 465) // explicit declaration
//    var numbers = longArrayOf(456, 564, 654, 465)
    val arrayname = Array(5, { i -> i * 1 }) // using constructor as array is a class

    // in - as used in python can be used here
    val sample = "new york" in city
    for(c in city)
        print(c + " ")

    // ranges
    val rangeExample = 1..6
    println(rangeExample)

    // or directly sub the range here
    for(i in rangeExample)
        println(i)


    println(add(1, 2))

    // If there is only single statement such as return for a function
    // it can be defined as
    fun myFunction(x: Double, y: Float) = x + y
    val ans = myFunction(0.5, 9.9f)



    // obj for the class can be constructed as follows
//    val obj1 = CarForSale()
//    var obj2 = CarForSale()
//    println(obj1.modelNo + " " + obj2.modelNo)


    val c1 = Car("Ford", "Mustang", 1969)
    c1.speed(100)
    val c2 = Car("BMW", "X5", 1999)
    val c3 = Car("Tesla", "Model S", 2020)


    // input same as java, using scanner
    var reader = Scanner(System.`in`)
    var yolo = reader.nextInt()

    //other method for read byte stream is readLine()
    var kas = readLine()!!.toInt()

    val i = 9 xor 3


    // !! double-bang operator -> returns value if not null else returns NullPointerException
    // ? safe call operator -> returns value if not null else returns null
    // Use the correct option in correct places
//    +------------+--------------------+---------------------+----------------------+
//    | a: String? |           a.length |           a?.length |           a!!.length |
//    +------------+--------------------+---------------------+----------------------+
//    |      "cat" | Compile time error |                   3 |                    3 |
//    |       null | Compile time error |                null | NullPointerException |
//    +------------+--------------------+---------------------+----------------------+



    // These are basics, try GFG for advanced topics
    // https://www.geeksforgeeks.org/kotlin-programming-language/

}

class Add constructor(a: Int, b: Int) {
    private var a: Int
    var b: Int
    init {
        this.a = a
        this.b = b
    }
}
class Add1(a: Int, b: Int) {
    var a: Int
    var b: Int
    init {
        this.a = a
        this.b = b
    }
}
class Add2 {
    var a: Int
    var b: Int
    constructor(a: Int, b: Int) {
        this.a = a
        this.b = b
    }
}


// getter and setter
class sample {
    var someValue: String = "abc"
        get() = field // optional
        set(value) {
            field = value
        }

    var someValue1: String = "abc"
        private set
    fun setSomeValue1(value: String) {
        someValue1 = value
    }
}
class Registration( email: String, pwd: String, age: Int , gender: Char) {

    var email_id: String = email
        // Custom Getter
        get() {
            return field.lowercase()
        }
    var password: String = pwd
        // Custom Setter
        set(value){
            field = if(value.length > 6) value else throw IllegalArgumentException("Passwords is too small")
        }
    var age: Int = age
        // Custom Setter
        set(value) {
            field = if(value > 18 ) value else throw IllegalArgumentException("Age must be 18+")
        }
    var gender : Char = gender
        // Custom Setter
        set (value){
            field = if(value == 'M') value else throw IllegalArgumentException("User should be male")
        }
}