object Acronym {
    fun generate(phrase: String) = phrase
        .split("(\\s|\\h|-|_)+".toRegex())
        .map { s -> s.first().uppercaseChar() }
        .joinToString("")
}
