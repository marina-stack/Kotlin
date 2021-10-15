fun main (args:Array<String>) {
    val events = arrayOf("Rock", "Paper", "Scissors")
    val gameResult = getGameChoise(events)
}

//computer chooses option
fun getGameChoise (eventsParam: Array<String>) = eventsParam [(Math.random()*eventsParam.size).toInt()]

fun getUserChoice (eventsParam: Array<String>): String {
    //an option request from the user
    print ("Пожалуйста, выберите одно из следующих значений:")
    for (index in eventsParam) print (" $index")
    print (".")
    //read user input
    val userInput = readLine ()

}
