package hashTable

fun main() {
    var s = "aadadaad"

    println(firstUniqChar2(s))
}

fun firstUniqChar2(s: String): Int {

    val linkedHashMap = linkedMapOf<Char, Int>()

    s.toList().forEachIndexed { index, key ->
        if(!linkedHashMap.containsKey(key)) {
            linkedHashMap[key] = index
        }else{
            linkedHashMap.put(key, -1)
        }
    }

//    return if(linkedHashMap.isEmpty()) -1 else linkedHashMap.values.first()

    linkedHashMap.values.forEach {
        if(it != -1) {
            return it
        }
    }

    return -1

}// end fun firstUniqChar()