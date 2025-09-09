
# Getting Started with Kotlin

This section will guide you through setting up your environment for Kotlin development and writing your first Kotlin program.

## 1. Setting Up Your Development Environment

You have several options for setting up your Kotlin development environment, depending on your specific needs and project goals:

### a. For Android Development:
*   **Android Studio**: This is the official IDE for Android development and comes with full Kotlin support out-of-the-box.
    1.  Download and install Android Studio from [developer.android.com/studio](https://developer.android.com/studio).
    2.  When creating a new project, Android Studio defaults to Kotlin as the primary language.
    3.  Existing Java-based Android projects can also have Kotlin files added, or Java files can be converted to Kotlin.

### b. For Other Kotlin Projects (Server-side, Desktop, Multiplatform):
*   **IntelliJ IDEA**: Developed by JetBrains (the creators of Kotlin), IntelliJ IDEA offers the best support for Kotlin.
    1.  Download and install IntelliJ IDEA (Community or Ultimate edition) from [www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/).
    2.  Kotlin plugin is usually bundled. If not, you can install it from `File > Settings/Preferences > Plugins`.
    3.  Create a new Kotlin project (e.g., Kotlin/JVM, Kotlin/JS, Kotlin/Native).

*   **Command Line Compiler**: For simple programs or scripting.
    1.  Download the Kotlin compiler (`kotlinc`) from the [Kotlin GitHub releases page](https://github.com/JetBrains/kotlin/releases/latest).
    2.  Follow the setup instructions to add the compiler to your system's PATH.

*   **Online Playgrounds**:
    *   **Kotlin Playground**: [play.kotlinlang.org](https://play.kotlinlang.org/) - Ideal for trying out small snippets of Kotlin code directly in your browser without any installation.

## 2. Your First Kotlin Program ("Hello, World!")

Let's write the classic "Hello, World!" program.

### Using IntelliJ IDEA or Android Studio (for a simple JVM application):

```kotlin
fun main() {
    println("Hello, Kotlin World!")
}
```

To run, simply click the green play button in the IDE. You'll see the output in the console.

### Using the Command Line Compiler:

```bash
kotlinc HelloWorld.kt -include-runtime -d HelloWorld.jar
java -jar HelloWorld.jar
```

Output:
```
Hello, Kotlin World!
```

## Explanation of the "Hello, World!" Program:

*   **`fun main() { ... }`**: The entry point of a Kotlin application.
*   **`println()`**: Prints text to the console.

## Next Steps in this Guide

Now that you’ve run your first Kotlin program, you're ready to dive deeper:
*   **Basic Syntax**
*   **Control Flow**
*   **Functions**
*   And more!
