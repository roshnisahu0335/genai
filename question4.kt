fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val square: (Int) -> Int = { it * it }
    val double: (Int) -> Int = { it * 2 }

    val squaredList = operateOnList(numbers, square)
    val doubledList = operateOnList(numbers, double)

    println("Original list: $numbers")
    println("Squared list: $squaredList")
    println("Doubled list: $doubledList")
}
