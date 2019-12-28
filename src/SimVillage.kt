fun main(args: Array<String>) {
    val greetingFunction: (String, Int) -> String = { playerName, numBuilding ->
        val currentYear = 2019
        println("Adding $numBuilding houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("Guyal", 2))
}