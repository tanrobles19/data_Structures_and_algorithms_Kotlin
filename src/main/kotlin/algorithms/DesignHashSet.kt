package algorithms

import leetCode.MyHashSet

fun main() {

    val array = IntArray(100)

//    for (k in array.indices) {
//        val index = k % array.size
//        println(index)
//    }

    val obj = MyHashSet()
    obj.add(1000000)
//    obj.remove(key)
    println( obj.contains(0))

}