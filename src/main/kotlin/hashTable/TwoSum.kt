package airbnb

fun main() {
    val array = intArrayOf(2,7,11,15)
}

fun twoSum(nums: IntArray, target: Int): IntArray {

    val hashMap = hashMapOf<Int,Int>()

    nums.forEachIndexed { index, value ->

        val valueSearch = target - value

        if(hashMap.containsKey(valueSearch)) {
            return intArrayOf(index, hashMap.get(valueSearch)!!)
        }else{
            hashMap.put(value, index)
        }
    }// end forEach

    return IntArray(1)

}
