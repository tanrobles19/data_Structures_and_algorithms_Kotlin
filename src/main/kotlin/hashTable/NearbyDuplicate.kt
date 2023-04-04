package hashTable

fun main() {
    val list = intArrayOf(1,0,1,1)
    containsNearbyDuplicate(list, 1)
}

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {

    val hashMap = hashMapOf<Int,Int>()

    nums.forEachIndexed { index, j ->
        if(hashMap.containsKey(j)) {
            val i = hashMap.get(j)!!

            val operation = Math.abs( i - index )

            if( operation <= k ) {
                return true
            }else{
                hashMap.remove(j)
                hashMap.put(j, index)
            }

        }else{
            hashMap.put(j, index)
        }
    }// end forEach

    return false
}