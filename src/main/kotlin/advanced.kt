// collections
// maps
//  treemap - sorted
//  linkedhashmap - maintains the order same as linkedlist
//  hashmap - general hashing methodology


// inheritance - single
// class properties must be initialized
open class Employee(name: String, id: Int) {
    init {
        println("Welcome $name")
    }
    fun payroll() {}
    fun leaveApply() {}
}
class Developer(var name: String, var id: Int, private val role: String) : Employee(name, id) {
    fun develop() {
        println("Developing...$role...")
    }
    fun code() {}
}


// inheritance - multilevel
open class Animal(var sense: Int, var legs: Int) {
    open fun eat() {}

}
open class Bird(var flyHeight: Float) : Animal(5, 2) {
    open fun pet() {}
}
class Crow() : Bird(8000.5f){
    override fun eat() {
    }
    override fun pet() {
        super.pet()
    }
    fun fly() {

    }
}


// inheritance - multiple - not applicable unless interface
// since multpile is not supported, hybrid is not possible



// inheritance - hierarchical
open class Iphone(var id: Int) {
    open fun camera() {}
    fun verifyFingerPrint() {}
}
class Iphone13(val price: Double) : Iphone(1123){
    fun faceIdScan() {}
}
class Iphone12Pro(val price: Double) : Iphone(3453){
    fun sideBarScan() {}
}



// overloading, overriding
// compile time polymorphism - overloading
class Book(var name: String = "bagavadgita") {
    // this() - to access this particular class
    // super() - to access the parent class constructor/func/property
    constructor(genre: String, pages: Int) : this()
    constructor(genre: String, pages: Int, price: Double) : this()
}

// runtime polymorphism - overriding
open class Iphone(var id: Int) {
    // open - to change the access modifier
    // by default all are final, so open makes it non final
    open fun camera() {}
    fun verifyFingerPrint() {}
}
class Iphone13(val price: Double) : Iphone(1123){
    fun faceIdScan() {}
    override fun camera() {
        println(" AI featured camera")
    }
}


// abstraction, interface
interface LivingThing {
    var inhale: String
    var foodType: String
    fun breathe()
    fun sleep()
    fun inhaleType() {
        println("Inhaling $inhale")
    }
}
class Plant : LivingThing {
    override var inhale: String = "CO2"
    override var foodType: String = "Strach"
    override fun breathe() {}
    override fun sleep() {}
}
class Human : LivingThing {
    override var inhale: String = "Oxygen"
    override var foodType: String = "All Food"
    override fun breathe() {}
    override fun sleep() {}
}




interface Animal {
    var sense: Int
    var legs: Int
    fun eat()
}
interface Bird : Animal {
    var flyingHeight: Double
    fun pet()
}
interface Mammal : Animal {
    var handsCount: Int
    fun walk()
    fun birth()
}
class Bat : Bird, Mammal{
    override var sense: Int = 0
    override var legs: Int = 2
        get() = field
        set(value) { field = value }
    override var flyingHeight: Double = 3000.45
        get() = field
        set(value) { field = value }
    override var handsCount: Int
        get() = field
        set(value) { field = value }
    override fun pet() {
    }
    override fun eat() {
    }
    override fun walk() {
    }
    override fun birth() {
    }
}




abstract class Car(var no: Int) {
    abstract var model: String
    var wheels: Int = 4
    abstract fun move()
}
class BMW(var id: Int): Car(id) {
    override var model: String = "BMW22"
    override fun move() {
        //code for the methodology of the car to move
    }
}


// nested class
// used for temp use, to use under a particular class scope alone
class Gender {
    // Gender contains Male and Female but to store extra values we can have it as a class
    class Male {
        // Male cannot access the outer class properties
    }
    inner class Female {
        // can access outer class property as well
    }
}



// SOLID principles

// Single responsibility principle
class Read(x: Int, y: Int) {
    fun byteStream() {}
    fun bitStream() {}
}

// Open-Closed Principle
interface Property {
    fun area(): Int
    fun perimeter(): Int
}
class Square(var length: Int) : Property{
    override fun area(): Int {
        return length * length
    }
    override fun perimeter(): Int {
        return 4 * length
    }
}
class Rectange(var length: Int, var breadth) : Property{
    override fun area(): Int {
        return length * breadth
    }
    override fun perimeter(): Int {
        return 2 * (length + breadth)
    }
}

// Liskov substitution principle
class Bird {
    fun walk() {}
}
class FlyingBird {
    fun fly() {}
}
class Ostrich: Bird {
    walk()
}
class Crow: FlyingBird {
    fly()
}

// Interface segregation principle
interface Animal{
    fun eat()
    fun sleep()
}

interface FlyingAnimal{
    fun fly()
}

// Dependency Inversion Principle
interface FaceScan {
    fun scan(): Boolean
}
class Iphone12Pro(var id: Int): FaceScan {
    override fun scan(): Boolean {
    }
}
class Iphone13(val id: Int) : FaceScan{
    override fun scan(): Boolean {
    }
}

// singleton class - only one object can be created
fun main(args: Array<String>) {

}