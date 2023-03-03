package leetCode

class MyHashMapNaive {

    private var arrayKey = arrayOfNulls<Int>(1000000)
    private var arrayValue = arrayOfNulls<Int>(1000000)

    private fun modularHashing(key: Int, arraSize: Int): Int {
        return key % arraSize
    }

    fun put(key: Int, value: Int) {
        val indexToStore = modularHashing(key, arrayKey.size)
        arrayKey[indexToStore] = key
        arrayValue[indexToStore] = value
    }

    fun get(key: Int): Int {

        val lookUpIndex = modularHashing(key, arrayKey.size)

        return if( arrayKey[lookUpIndex] == key) arrayValue[lookUpIndex]!! else -1
    }

    fun remove(key: Int) {

        val lookUpIndex = modularHashing(key, arrayKey.size)

        if(arrayKey[lookUpIndex] == key) {
            arrayKey[lookUpIndex] = null
            arrayValue[lookUpIndex] = null

        }
    }

}