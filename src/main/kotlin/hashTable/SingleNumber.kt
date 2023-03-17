package algorithms

fun main() {

    var nums = intArrayOf(2, 2, 1)
    singleNumber(nums)
}

fun singleNumber(nums: IntArray): Int {

    val hashSet = hashSetOf<Int>()

    for (value in nums) {
        if(!hashSet.add(value)) {
            hashSet.remove(value)
        }
    }

    return hashSet.single()
}