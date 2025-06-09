fun <T> getElementAtIndex(list: List<T>, index: Int): T? {
    return try {
        list[index]
    } catch (e: IndexOutOfBoundsException) {
        println("Error: Index $index is out of bounds for the list.")
        null
    }
}


