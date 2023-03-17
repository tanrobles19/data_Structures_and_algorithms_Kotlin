package airbnb

fun main() {
    println(lengthOfLongestSubstring(""))
}

fun lengthOfLongestSubstring(s: String): Int {

    val charList = s.toList()
    var index = 0
    var mainIndex = 0
    var longest = 0
    var hastSet = hashSetOf<Char>()

    if(charList.isEmpty()) {
        return 0
    }

    do{
        val character = charList[index]

        if(!hastSet.contains(character)) {
            hastSet.add(character)
        }else{
            val newLongest = hastSet.size

            mainIndex++
            index = mainIndex

            if(newLongest > longest) {
                longest = newLongest
            }

            hastSet.clear()
            continue
        }// end else

        index++
    }while ( index < charList.size)

    return if(hastSet.size > longest) {
        hastSet.size
    }else{
        longest
    }

}