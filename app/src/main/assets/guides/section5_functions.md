
# Functions in Kotlin

Functions are fundamental building blocks in Kotlin, allowing you to encapsulate reusable blocks of code. They enhance code organization, readability, and maintainability.

## Defining Functions

```kotlin
fun greet(name: String): String {
    return "Hello, ${'$'}name!"
}
println(greet("Kotlin"))
// Expected output: Hello, Kotlin!
```

## Single-Expression Functions

```kotlin
fun square(x: Int) = x * x
println(square(4)) // 16
```

## Default and Named Arguments

```kotlin
fun greetUser(name: String, greeting: String = "Hello") {
    println("${'$'}greeting, ${'$'}name!")
}

greetUser("Alice")
greetUser("Bob", "Hi")
greetUser(name = "Charlie", greeting = "Welcome")
```

## Higher-Order Functions

Functions that take other functions as parameters:

```kotlin
fun operate(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

val sum = operate(5, 3) { a, b -> a + b }
println(sum) // 8
```

## Lambdas

```kotlin
val double = { x: Int -> x * 2 }
println(double(4)) // 8
```

---

Next: Classes and Objects → Learn OOP in Kotlin!
