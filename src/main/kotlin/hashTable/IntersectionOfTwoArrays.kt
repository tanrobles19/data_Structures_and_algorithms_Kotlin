package hashTable

import algorithms.singleNumber

fun main() {
    var nums = intArrayOf(1, 2, 2, 1)
    var nums2 = intArrayOf(2, 2)

    intersection(nums, nums2)
}

fun intersection(nums1: IntArray, nums2: IntArray): IntArray {

    val hashSet = hashSetOf<Int>()
    val intersection = hashSetOf<Int>()

    nums1.forEach {
        hashSet.add(it)
    }

    nums2.forEachIndexed { index, value ->
        if(hashSet.contains(value)) {
            intersection.add(value)
        }
    }

    hashSet.toList()

    return intersection.toIntArray()

}