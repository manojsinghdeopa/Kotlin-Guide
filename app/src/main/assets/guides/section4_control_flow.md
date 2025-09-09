
# Control Flow in Kotlin

Control flow structures are fundamental in programming as they dictate the order in which statements are executed. Kotlin provides several constructs to manage the flow of execution, making your code more logical and efficient.

## If Expressions

```kotlin
val number = 10
val result = if (number % 2 == 0) "Even" else "Odd"
println(result) // Even
```

`if` can also be multi-line:

```kotlin
val grade = 85
val status = if (grade >= 50) {
    println("Passed!")
    "Pass"
} else {
    println("Failed!")
    "Fail"
}
```

## When Expression

`when` is like `switch` in other languages:

```kotlin
val day = 3
val dayName = when (day) {
    1 -> "Monday"
    2 -> "Tuesday"
    3 -> "Wednesday"
    4, 5 -> "Thursday or Friday"
    in 6..7 -> "Weekend"
    else -> "Invalid"
}
println(dayName) // Wednesday
```

## Loops

### For Loop

```kotlin
for (i in 1..5) {
    println(i)
}
```

### While and Do-While

```kotlin
var count = 3
while (count > 0) {
    println(count)
    count--
}

do {
    println("Runs at least once")
} while (false)
```

---

Next: Functions → Learn how to create reusable blocks of code!
