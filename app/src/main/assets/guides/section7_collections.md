
# Collections in Kotlin

Collections are fundamental structures for storing and managing groups of related data. Kotlin's standard library provides a rich set of tools for working with collections, emphasizing both immutability and mutability, along with powerful functional operations.

## Types of Collections

* **List**: Ordered collection (can contain duplicates).
* **Set**: Unordered collection (no duplicates).
* **Map**: Key-value pairs.

## Immutable vs Mutable

```kotlin
val numbers = listOf(1, 2, 3)       // immutable
val mutableNumbers = mutableListOf(1, 2, 3)
mutableNumbers.add(4)
```

## List Example

```kotlin
val fruits = listOf("Apple", "Banana", "Cherry")
for (fruit in fruits) println(fruit)
```

## Set Example

```kotlin
val uniqueNumbers = setOf(1, 2, 2, 3)
println(uniqueNumbers) // [1, 2, 3]
```

## Map Example

```kotlin
val capitals = mapOf("France" to "Paris", "Japan" to "Tokyo")
println(capitals["France"]) // Paris
```

## Collection Operations

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)
val doubled = numbers.map { it * 2 }
val evens = numbers.filter { it % 2 == 0 }
val sum = numbers.reduce { acc, i -> acc + i }

println(doubled) // [2, 4, 6, 8, 10]
println(evens)   // [2, 4]
println(sum)     // 15
```

---

Next: Coroutines → Learn about async programming in Kotlin!
