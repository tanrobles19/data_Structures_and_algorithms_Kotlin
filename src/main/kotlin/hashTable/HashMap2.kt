package hashTable

import model.Node
import java.security.Key
import java.util.Hashtable

class HashMap2 {

    private var list = arrayOfNulls<Slot>(512)
    data class Slot(var list : ArrayList<Node>)
    data class Node(val key: Int, var value: Int)

    fun put(key: Int, value: Int) {
        val slot = list[modularHashing(key)]

        if(slot == null) {
            list[modularHashing(key)] = Slot(arrayListOf(Node(key, value)))
            return
        }

        slot.list.forEach {
            if(it.key == key) {
                it.value = value
                return
            }
        }

        slot.list.add(Node(key, value))// bug

    }

    fun get(key: Int): Int {
        val slot = list[modularHashing(key)]

        slot?.list?.forEach {
            if(it.key == key) return it.value
        }
        return -1
    }

    fun remove(key: Int) {

        val slot = list[modularHashing(key)]

        var removeIndex = -1

        slot?.list?.forEachIndexed { index, node ->
            if(node.key == key) {
                removeIndex = index
            }
        }

        if(removeIndex != -1) slot?.list?.removeAt(removeIndex)

    }

    private fun modularHashing(key: Int) : Int{
        return key % list.size
    }



}

fun main() {

    val hashTest = HashMap2()

    hashTest.put(1,1)
    hashTest.put(2,2)
    hashTest.put(2,1)

    println(hashTest.get(1))

}