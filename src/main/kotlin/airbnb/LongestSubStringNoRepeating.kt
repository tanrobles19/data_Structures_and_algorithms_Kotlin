package airbnb

fun main() {
    println(lengthOfLongestSubstring(""))
}

fun lengthOfLongestSubstring(s: String): Int {

    var index = 0
    var mainIndex = 0
    var longest = 0
    var hastSet = hashSetOf<Char>()

    if(s.isEmpty()) {
        return 0
    }

    do{
        val character = s[index]

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
    }while ( index < s.length)

    return if(hastSet.size > longest) {
        hastSet.size
    }else{
        longest
    }

}