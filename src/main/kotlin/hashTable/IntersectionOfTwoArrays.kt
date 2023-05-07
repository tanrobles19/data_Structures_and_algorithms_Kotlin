package hashTable

import algorithms.singleNumber

fun main() {
    var nums = intArrayOf(1, 2, 2, 1)
    var nums2 = intArrayOf(2, 2)

    println(intersection(nums, nums2))
}

fun intersection(nums1: IntArray, nums2: IntArray): IntArray {

    val numHasSet = hashSetOf<Int>()
    val resultHasSet = hashSetOf<Int>()

    nums1.forEach {
        numHasSet.add(it)
    }

    nums2.forEach {
        if( numHasSet.contains(it) ) resultHasSet.add(it)
    }

    return  resultHasSet.toIntArray()
}