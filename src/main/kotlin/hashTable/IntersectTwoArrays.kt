package hashTable

fun main() {

}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {

    val hashMap = hashMapOf<Int,Int>()
    val resultArray = arrayListOf<Int>()

    nums1.forEach {
        if(hashMap.containsKey(it)) {
            hashMap.put(it, hashMap.get(it)!! + 1)
        }else{
            hashMap.put(it, 1)
        }
    }

    nums2.forEach {
        if(hashMap.containsKey(it)) {
            if(hashMap.get(it)!! > 0) {
                resultArray.add(it)
                hashMap.put(it, hashMap.get(it)!! -1)
            }
        }
    }// end forEach

    return resultArray.toIntArray()

}