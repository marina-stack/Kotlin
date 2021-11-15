fun main (args: Array<String>) {
    val sOne = Song ("We will Rock You", "Queen")
    val sTwo = Song ("Sweet Child o' Mine", "Guns N' Roses")
    val sThree = Song ("Highway To Hell", "AC/DC")

    //stop the song sOne
    sOne.stop ()
    //play the song sTwo
    sTwo.play ()
    //stop the song sTwo
    sTwo.stop ()
    //play the song sThree
    sThree.play()

}

class Song (val title: String, val artist: String) {
    //add the play function
    fun play () {
        println ("Играет песня $title исполнителя $artist")
    }
    //add the stop function
    fun stop () {
        println ("Остановить песню $title")
    }
}
