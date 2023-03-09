package util

object Util {

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