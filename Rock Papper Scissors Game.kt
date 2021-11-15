fun main (args:Array<String>) {
    val events = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoise(events)
    val userChoice = getUserChoice(events)
    printRslt (userChoice, gameChoice)
}

//computer chooses option
fun getGameChoise (eventsParam: Array<String>) = eventsParam [(Math.random()*eventsParam.size).toInt()]

//user chooses option
fun getUserChoice (eventsParam: Array<String>): String {
    var validChoice = false
    var userChoice = ""

    //the loop runs unli a valid value is entered
    while (!validChoice) {
        //an option request from the user
        println ("Пожалуйста, выберите одно из следующих значений:")
        for (index in eventsParam) print (" $index")
        print (".")
        println ()

        //read user input
        val userInput = readLine ()

        //checking the correctness of the value entered by the user
        if (userInput != null && userInput in eventsParam) {
            validChoice = true
            userChoice = userInput
        }

        //displaying a msg to the user about an invalid input option
        if (!validChoice) println ("Введите допустимое значение")
    }
    return userChoice
}

//result output
fun printRslt (userChoice: String, gameChoice: String) {
    val rslt: String

    //determine the result of the game
    if (userChoice == gameChoice) rslt = "Ничья!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")
    )
        rslt = "Ты победил!"

    else rslt = "Ты проиграл!"

    //output of the game result
    println ("Твой выбор $userChoice. Выбор компьютера $gameChoice. Результат игры: $rslt")

}
