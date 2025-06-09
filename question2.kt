fun <T> myFilter(predicate: (T) -> Boolean, iterable: List<T>): List<T> {
    val result = mutableListOf<T>()
    for (item in iterable) {
        if (predicate(item)) {
            result.add(item)
        }
    }
    return result
}

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbersCustom = myFilter<Int>({ it % 2 == 0 }, numbers)

    println(evenNumbersCustom)
}
