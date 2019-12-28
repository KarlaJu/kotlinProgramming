fun main(args: Array<String>) {
    val greetingFunction: () -> String = {
        val currentYear = 2019
        "Welcome to SimVillage, Mayor! (copyright $currentYear)"
    }
    println(greetingFunction())
}