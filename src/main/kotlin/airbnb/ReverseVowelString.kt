package airbnb

import java.lang.StringBuilder

fun main() {
    reverseVowels("Jonethan")
}

fun reverseVowels(s: String): String {

    val list = s.toMutableList()

    val hashSetVowel = hashSetOf<Char>()
    hashSetVowel.add('a')
    hashSetVowel.add('e')
    hashSetVowel.add('i')
    hashSetVowel.add('o')
    hashSetVowel.add('u')
    hashSetVowel.add('A')
    hashSetVowel.add('E')
    hashSetVowel.add('I')
    hashSetVowel.add('O')
    hashSetVowel.add('U')

    var rightIndex = list.size -1

    var leftIndex = 0

    while (leftIndex < list.size) {

        if(leftIndex >= rightIndex) {
            break
        }

        val left = list[leftIndex]
        val right = list[rightIndex]

        if(hashSetVowel.contains(left) && hashSetVowel.contains(right)) {
            list[rightIndex] = left
            list[leftIndex] = right
            leftIndex++
            rightIndex--
        }

        if(!hashSetVowel.contains(left)) {
            leftIndex++
        }

        if(!hashSetVowel.contains(right)) {
            rightIndex--
        }

    }// end while

    val result = StringBuilder()

    list.forEach{value ->
        result.append(value)
    }

    return result.toString()

}