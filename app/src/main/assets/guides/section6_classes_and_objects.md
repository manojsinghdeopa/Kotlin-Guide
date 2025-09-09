
# Classes and Objects in Kotlin

Kotlin is a powerful object-oriented programming language that provides robust support for classes, inheritance, and objects. These features allow for the creation of well-structured, reusable, and maintainable code.

## Defining a Class

A class in Kotlin is defined using the `class` keyword. It can have properties (variables) and member functions (methods).

```kotlin
class Person(val name: String, var age: Int) {
    fun greet() {
        println("Hello, my name is ${'$'}name and I am ${'$'}age years old.")
    }
}

val person = Person("Alice", 25)
person.greet()
```

## Constructors

* Primary constructor: in the class header.  
* Secondary constructor: inside the class.

```kotlin
class Car(val brand: String) {
    var year: Int = 2023

    constructor(brand: String, year: Int) : this(brand) {
        this.year = year
    }
}
```

## Inheritance

```kotlin
open class Animal {
    open fun sound() = println("Some sound")
}

class Dog : Animal() {
    override fun sound() = println("Woof!")
}
```

## Data Classes

Automatically generates `toString()`, `equals()`, `hashCode()`:

```kotlin
data class User(val id: Int, val name: String)
val user = User(1, "Alice")
println(user)
```

## Objects (Singletons)

```kotlin
object Logger {
    fun log(message: String) = println("Log: ${'$'}message")
}

Logger.log("App started")
```

## Companion Objects

```kotlin
class Utils {
    companion object {
        fun add(a: Int, b: Int) = a + b
    }
}

println(Utils.add(2, 3))
```

---

Next: Collections → Learn how to work with lists, sets, and maps!
