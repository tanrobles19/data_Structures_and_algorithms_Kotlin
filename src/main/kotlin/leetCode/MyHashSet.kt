package leetCode

class MyHashSet() {

    private val array = arrayOfNulls<Int>(1000002)

    //Modular Hashing
    //https://algs4.cs.princeton.edu/34hash/

    fun add(key: Int) {
        if(!contains(key)) {
            array[key % array.size] = key
        }
    }

    fun remove(key: Int) {
        array[key % array.size] = null
    }

    fun contains(key: Int): Boolean {
        return array[key % array.size] != null
    }

}