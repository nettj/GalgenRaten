data class Word(val name: String, val strength: Boolean) {

    private val nameAsCharArray: CharArray

    init {
        nameAsCharArray = CharArray(size = wordLength()) { '_' }
    }

    fun wordLength(): Int {
        return name.length

    }

    fun guessed(): Boolean {
        return !nameAsCharArray.contains('_')
    }

    override fun toString(): String {
        return String(nameAsCharArray)
    }

    fun searchLetter(letter: Char): Int {
        var resultCount = 0
        name.toCharArray().forEachIndexed { index, char ->
            if(char.lowercaseChar() == letter.lowercaseChar()) {
                nameAsCharArray[index] = name[index]
                resultCount++
            }
        }
        return resultCount
    }
}
