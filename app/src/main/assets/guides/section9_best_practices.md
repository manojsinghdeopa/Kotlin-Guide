
# Best Practices in Kotlin

Adhering to best practices is crucial for writing clean, maintainable, and efficient Kotlin code. This section outlines key guidelines to enhance your Kotlin development.

## 1. Prefer `val` over `var`

Immutability is a cornerstone of robust software. By default, declare variables using `val` to make them read-only. This helps prevent unintended side effects and makes code easier to reason about. Use `var` only when a variable's value truly needs to change after initialization.

```kotlin
val name = "Kotlin" // immutable
```

## 2. Use Null Safety

```kotlin
val name: String? = null
println(name?.length) // safe call
```

## 3. Use Data Classes

```kotlin
data class User(val id: Int, val name: String)
```

## 4. Extension Functions

```kotlin
fun String.isEmail() = this.contains("@")
println("test@example.com".isEmail())
```

## 5. Keep Functions Small

Each function should do one thing well.

## 6. Leverage Kotlin Collections

Use functions like `map`, `filter`, `reduce` for concise code.

## 7. Use Coroutines Instead of Threads

Lightweight and efficient for async tasks.

---

Next: Resources → Where to learn more about Kotlin!
