
# Coroutines in Kotlin

Coroutines simplify asynchronous programming.
They provide a way to write non-blocking code in a sequential manner.

## What is a Coroutine?

A coroutine is a computation that can be suspended and resumed.
It's like a lightweight thread that can be paused and resumed without blocking the main thread, making them efficient for I/O-bound and CPU-bound tasks.

## Basic Example
This example demonstrates launching a coroutine that delays for 1 second before printing "World!".
```kotlin

fun main() = runBlocking {
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
}
```

Output:
```
Hello,
World!
```

## Suspend Functions

```kotlin
suspend fun fetchData(): String {
    delay(2000L)
    return "Data loaded"
}

fun main() = runBlocking {
    println(fetchData())
}
```

## Async and Await

```kotlin
fun main() = runBlocking {
    val result1 = async { 10 + 20 }
    val result2 = async { 30 + 40 }
    println(result1.await() + result2.await()) // 100
}
```

## Structured Concurrency

Coroutines launched in a scope are automatically cancelled when the scope ends, preventing leaks.

---

Next: Best Practices → Learn how to write clean, safe Kotlin code!
