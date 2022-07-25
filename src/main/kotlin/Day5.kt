// Infix function - short inline function for clean code and nest readability
class Assertion<T>(val target: T) {
    infix fun isEqualTo(value: T) {
        (value == target)
    }
    infix fun isDifferentTo(value: T) {
        value != target
    }
}

fun main(args: Array<String>) {
    var assert = Assertion(10)
    assert isEqualTo 10
    assert isDifferentTo 12


    // lambda expression - online function with return value
    // can be used to store the value to a variable
    val square = { number: Long -> number * number}
    val value = square(10L)

    val magToString = { input: Int ->
        val mag = input * 5
        mag.toString()
    }
    val temp = magToString(10)


    // it to specify the current hold - same as this
    val array = arrayOf(1, 2, 3, 4)
    array.forEach { item -> println(item * 2) }
    array.forEach { println(it * 2) } // it refers to the current pointer
}