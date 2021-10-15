fun main (args:Array<String>) {

    val messageFunctions = doSomething("Meow", 10)
}

fun doSomething(msg: String, i: Int): Unit {
    if (i > 0) {
        var x = 0
        while (x < i) {
            println(msg)
            x = x + 1
        }
    }
}
