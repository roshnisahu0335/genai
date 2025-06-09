fun main() {
    val input = "abc"
    val number: Int? = try {
        input.toInt()
    } catch (e: NumberFormatException) {
        println("Error: '$input' is not a valid number.")
        null
    }

    println("Parsed number: $number")
}
