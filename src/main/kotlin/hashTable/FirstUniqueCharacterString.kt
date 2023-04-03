package hashTable

fun main() {
    var s = "aabb"

    println(firstUniqChar(s))
}

fun firstUniqChar(s: String): Int {

    val hashMap = hashMapOf<Char, Int>()

    s.forEach {
        hashMap.put(it, hashMap.getOrDefault(it, 0) + 1)
    }

    s.forEachIndexed { index, value ->
        if(hashMap.get(value) == 1 ) {
            return index
        }
    }

    return -1

}// end fun firstUniqChar()