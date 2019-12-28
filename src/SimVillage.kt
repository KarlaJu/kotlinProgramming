fun main(args: Array<String>) {
    val greetingFunction = {
        val currentYear = 2019
        "Welcome to SimVillage (copyright $currentYear)"
    }
    println(greetingFunction())
}