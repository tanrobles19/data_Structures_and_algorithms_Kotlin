package airbnb

import java.util.Stack

fun main() {
    val array = intArrayOf(2,7,11,15)

    val input = "]"

    isValid(input)

}

fun isValid2(s: String): Boolean {

    val list = s.toList()
    val arrayList = arrayListOf<Char>()

    list.forEach {
        println(it)

        when(it) {
            '(', '[', '{' -> {
                arrayList.add(it)
            }
            ')' -> {

                if(arrayList.isEmpty()) return false

                val value = arrayList.removeAt(arrayList.lastIndex)

                if ('(' != value) {
                    return false
                }
            }
            ']' -> {

                if(arrayList.isEmpty()) return false

                val value = arrayList.removeAt(arrayList.lastIndex)

                if ('[' != value) {
                    return false
                }
            }
            '}' -> {

                if(arrayList.isEmpty()) return false
                val value = arrayList.removeAt(arrayList.lastIndex)

                if ('{' != value) {
                    return false
                }
            }
        }
    }// end when

    return arrayList.isEmpty()

}