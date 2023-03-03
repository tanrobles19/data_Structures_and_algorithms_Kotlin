package leetCode
class MyHashSet {

    data class Bucket(var list: ArrayList<Int>) {
        fun put(key: Int): Bucket {
            if(!contains(key)){
                list.add(key)
            }
            return this
        }
        fun contains(key: Int): Boolean {
            for (bucketKey in list) {
                if(bucketKey == key) {
                    return true
                }
            }
            return false
        }

        fun remove(key: Int) {

            var keyFound = -1

            for (value in list) {
                if(value == key) {
                    keyFound = value
                    break
                }
            }

            if(keyFound != -1) {
                list.remove(keyFound)
            }

        }

    }

    private var list = arrayOfNulls<Bucket?>(512)
    private fun modularHash(key: Int): Int {
        return key % list.size
    }
    fun add(key: Int) {

        val hash = modularHash(key)

        if(list[hash] == null) {
            list[hash] = Bucket(arrayListOf()).put(key)
        }else{
            list[hash]?.put(key)
        }

    }

    fun remove(key: Int) {
        list[key % list.size]?.remove(key)
    }

    fun contains(key: Int): Boolean {

        return if(list[key % list.size] != null) {
            list[modularHash(key)]?.contains(key)!!
        }else{
            false
        }
    }

}