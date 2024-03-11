var wordsList: List<Word> = listOf(
    Word("Waschlappen", false),
    Word("Wegwerfwindel", false),
    Word("Typ", true),
    Word("Gaensefuesschen", true),
    Word("Dampfschifffahrtsgesellschaft", true),

    )

fun randomWord(list: List<Word>) :Word {
    val index = (0 until list.size).random()
    return list[index]

}
