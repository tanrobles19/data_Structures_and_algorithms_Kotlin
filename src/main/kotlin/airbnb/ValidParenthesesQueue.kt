package airbnb

import java.util.Stack

fun main() {
    val array = intArrayOf(2,7,11,15)

    val input = "]"

    isValid(input)

}

fun isValid(s: String): Boolean {

    val charList = s.toList()
    val stack = Stack<Char>()

    charList.forEach {value ->
        when(value) {
            '(', '[', '{' -> stack.push(value)
            ')' -> {

                if(stack.isEmpty()) return false

                val currentChar = stack.pop()

                if(currentChar != '(') {
                    return false
                }

            }
            ']' -> {

                if(stack.isEmpty()) return false

                val currentChar = stack.pop()

                if(currentChar != '[') {
                    return false
                }

            }
            '}' -> {

                if(stack.isEmpty()) return false

                val currentChar = stack.pop()

                if(currentChar != '{') {
                    return false
                }

            }
        }// end when
    }// end foreach

    return stack.isEmpty()

}