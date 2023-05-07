package algorithms

fun main() {

}

fun containsDuplicate(nums: IntArray): Boolean {

    val hashSet = hashSetOf<Int>()

    nums.forEach {number ->
        if(!hashSet.add(number)) return true
    }
    return false
}