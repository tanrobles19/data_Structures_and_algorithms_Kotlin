package airbnb

fun main() {
    val array = intArrayOf(2,7,11,15)
}
fun twoSum(nums: IntArray, target: Int): IntArray {

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