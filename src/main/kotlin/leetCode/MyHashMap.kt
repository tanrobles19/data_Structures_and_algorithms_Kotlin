package leetCode

//import model.Bucket
//import model.Node

class MyHashMap {

    data class Node(val key: Int, var value: Int)
    data class Bucket(var bucketList: ArrayList<Node?> = arrayListOf()){

        fun get(key: Int): Int {
            for (node in this.bucketList) {
                if(node?.key == key) {
                    return node.value
                }
            }
            return -1
        }

        fun update(key: Int, value: Int) {
            var found = false
            for (node in this.bucketList) {
                if(node?.key == key) {
                    node.value = value
                    found = true
                    break
                }
            }
            if(!found) {
                this.bucketList.add(Node(key, value))
            }
        }

        fun remove(key: Int) {
            for (node in this.bucketList) {
                if (node?.key == key) {
                    this.bucketList.remove(node)
                    break
                }
            }
        }

    }

    var mainList : ArrayList<Bucket> = arrayListOf()

    constructor() {
        for ( i in 0..2069) {
            mainList.add(Bucket())
        }
    }

    fun put(key: Int, value: Int) {
        this.mainList[key % mainList.size].update(key,value)
    }

    fun get(key: Int): Int {
        return this.mainList[key % mainList.size].get(key)
    }

    fun remove(key: Int) {
        this.mainList[key % mainList.size].remove(key)
    }

}