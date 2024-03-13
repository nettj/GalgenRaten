fun main() {
    val word = randomWord(wordsList)
    var tryIt = 0
    println("Errate das Wort")
    var enterLetters = mutableListOf<Char>()

    do {
        println(word)
        println("Gebe einen Buchstaben ein")
        try {

            val input = readln().first()
            val searchLetter = word.searchLetter(input)
            if (enterLetters.contains(input)) {
                println("Dieser Buchstabe wurde schon eingegeben.")
                continue
            }
            if (searchLetter == 0) {
                println(galgen[tryIt])
                tryIt++
            } else println("Buchstabe gefunden $searchLetter mal")

            enterLetters.add(input)

        } catch (e: Exception) {
            println(galgen[tryIt])
            tryIt++
        }
    } while (!word.guessed() && tryIt < galgen.size)
    if (tryIt == galgen.size) {
        println("Du bist TOD")
    } else println("Bravo das Wort ist $word")

}







