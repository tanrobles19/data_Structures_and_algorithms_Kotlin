package hashTable

fun main() {

    val s = "paper"
    val t = "title"

    println(isIsomorphic2(s, t))

}

fun isIsomorphic2(s: String, t: String): Boolean {

    if(s.length != t.length) return false

    val hashMap = hashMapOf<Char, Char>()
    val hashSet = hashSetOf<Char>()

    val tList = t.toList()

    s.toList().forEachIndexed { index, value ->

        if (hashMap.containsKey(value)) {
            val tValue = hashMap.get(value)
            if(tList[index] != tValue) {
                return false
            }
        }else{

            if(hashSet.contains(tList[index])) {
                return false
            }

            hashMap.put(value, tList[index])
            hashSet.add(tList[index])
        }

    }// end foreach

    return true
}