package airbnb

fun main() {
    val array = intArrayOf(2,7,11,15)
}
fun twoSum(nums: IntArray, target: Int): IntArray {

    val hashMap = hashMapOf<Int, Int>()

    nums.forEachIndexed { index, value ->
        hashMap[target - value]?.let {
            return intArrayOf(it, index)
        }
        hashMap[value] = index
    }

    return intArrayOf()

}