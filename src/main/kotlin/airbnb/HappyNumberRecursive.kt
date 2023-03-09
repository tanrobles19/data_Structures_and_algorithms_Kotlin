
class Solution {

    val hashSet = hashSetOf<Int>()

    fun isHappy(n: Int): Boolean {

        val digitList = integerToDigitList(n)

        var addition = 0

        digitList.reversed().forEach {value ->
            addition += (value * value)
        }

        println(addition)

        if(!hashSet.contains(addition)) {
            hashSet.add(addition)
        }else{
            return false
        }

        if(addition == 1)
            return true

        return isHappy(addition)
    }

    fun integerToDigitList(n: Int): List<Int> {

        var number = n
        val digitsList = arrayListOf<Int>()

        while (number != 0) {
            digitsList.add(number % 10)
            number /= 10
        }

        return digitsList

    }// end fun integerToDigitList()

}