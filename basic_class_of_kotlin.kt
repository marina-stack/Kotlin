fun main (args: Array<String>) {
    var myDog = Dog ("Tasty", 50, "German Shepherd")
    var dogs = arrayOf (Dog("Fill", 5, "Corgi"), Dog("Ripper", 10, "Car"))


    println (myDog.breed)
    myDog.bark ()

    dogs[1].weight = 4
    println (dogs[1].weight)
    dogs[0].bark ()
}

class Dog (val name: String, var weight: Int, val breed: String) {
    fun bark () {
        println (if (weight<20) "Тявкать" else "Гавкать")
    }
}
