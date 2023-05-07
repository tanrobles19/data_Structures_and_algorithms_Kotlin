package airbnb

import util.Util
import kotlin.math.pow

fun main() {

    println(isHappy(2))

//    integerToDigits(19)

}

fun isHappy(n: Int): Boolean {

    var sum = n
    val resultsHashSet = hashSetOf<Int>()

    do {

        val temp = sum
        sum = 0
        integerToDigits(temp).forEach {
            sum += (it * it)
        }

        if(sum == 1) return true

        if (resultsHashSet.contains(sum)) {
            return false
        }else{
            resultsHashSet.add(sum)
        }

    }while (true)

}
private fun integerToDigits(number : Int) : List<Int>{
    var numberTemp = number
    val listOfDigits = arrayListOf<Int>()

    while (numberTemp != 0) {
        listOfDigits.add( numberTemp % 10 )
        numberTemp /= 10
    }
    return listOfDigits
}