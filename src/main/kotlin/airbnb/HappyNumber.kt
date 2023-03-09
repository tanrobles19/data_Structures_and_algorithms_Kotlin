package airbnb

import util.Util
import kotlin.math.pow

fun main() {

    println(isHappy(3))
}

fun isHappy(n: Int): Boolean {

    var number = n
    var addition = 0
    val hashSet = hashSetOf<Int>()

    do {

        val digitList = Util.integerToDigitList(number)

        digitList.reversed().forEach { value ->
            addition += (value * value)
        }

        if (!hashSet.add(addition)) {
            break
        }else{
            number = addition
            addition = 0
        }

    } while (number != 1)

    return number == 1

}// end fun isHappy()
