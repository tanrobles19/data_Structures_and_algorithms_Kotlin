package algorithms

import leetCode.MyHashSet

fun main() {


}
fun twoSum(nums: IntArray, target: Int): IntArray {
//    val array : IntArray = intArrayOf(2,7,11,15)

    val hashMap = hashMapOf<Int, Int>()

    nums.forEachIndexed { index, value ->

        if (hashMap.containsKey(value)) {
            return intArrayOf(hashMap[value]!!, index)
        }else{
            val number = target - value
            hashMap[number] = index
        }


    }

    return intArrayOf()

}
