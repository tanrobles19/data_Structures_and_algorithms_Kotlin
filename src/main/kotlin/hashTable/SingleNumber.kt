package algorithms

fun main() {

    var nums = intArrayOf(4, 1, 2, 1, 2)
    singleNumber(nums)
}

fun singleNumber(nums: IntArray): Int {

    val hashMap = hashMapOf<Int, Int>()

    nums.forEach {number ->
        if(hashMap.containsKey(number)) {
            hashMap.put(number, 2)
        }else{
            hashMap.put(number, 1)
        }
    }

    hashMap.entries.forEach {entry ->
        if(entry.value == 1) return entry.key
    }

    return 1

}