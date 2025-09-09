
# Basic Syntax in Kotlin

Kotlin's syntax is renowned for its clarity, conciseness, and expressiveness, contributing to a more enjoyable and efficient coding experience. Let's delve into the core elements of Kotlin syntax.

## Variables

You can declare variables using `val` (immutable) or `var` (mutable):

```kotlin
val name = "Kotlin"   // immutable (read-only)
var age = 5           // mutable (can change)
age = 6               // valid
// name = "Java"      // error: val cannot be reassigned

val explicitType: String = "This is explicitly typed"
```

## Data Types

Kotlin provides a rich set of built-in data types, including common ones like `Int` for integers, `Double` for floating-point numbers, `Boolean` for true/false values, `Char` for single characters, and `String` for sequences of characters.

```kotlin
val number: Int = 42
val pi = 3.14       // type inferred as Double
val isKotlinFun = true
```

## Type Inference

The compiler automatically infers the type:

```kotlin
val language = "Kotlin"   // String
val version = 1.9         // Double
```

## String Templates

You can embed variables directly in strings:

```kotlin
val name = "Kotlin"
println("Hello, ${'$'}name!")       // Hello, Kotlin!
println("2 + 2 = ${'$'}{2 + 2}")    // 2 + 2 = 4
```

## Comments

* Single-line: `//`
* Multi-line: `/* ... */`
* KDoc (for documentation): `/** ... */`

---

Next: Control flow in Kotlin → Learn about `if`, `when`, loops, and ranges!
