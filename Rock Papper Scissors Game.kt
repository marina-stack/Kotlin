fun main (args:Array<String>) {
    val events = arrayOf("Rock", "Paper", "Scissors")
    val gameResult = getGameChoise(events)
}

fun getGameChoise (eventsParam: Array<String>) = eventsParam [(Math.random()*eventsParam.size).toInt()]
