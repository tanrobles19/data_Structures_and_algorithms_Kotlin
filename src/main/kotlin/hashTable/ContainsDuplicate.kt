package algorithms

fun main() {

}

fun containsDuplicate(nums: IntArray): Boolean {

    val hashSet = hashSetOf<Int>()

    for (value in nums) {
        if (!hashSet.add(value))
            return true
    }

    return false

}// end fun containsDuplicate()