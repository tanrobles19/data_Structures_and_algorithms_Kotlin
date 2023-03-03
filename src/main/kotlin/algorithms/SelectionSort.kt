package algorithms

import leetCode.MyHashMap
import model.Node

fun main() {
    var myMap = MyHashMap()

    myMap.put(1,1)
    myMap.put(2,2)
    myMap.get(1)
    myMap.get(3)
    myMap.put(2,1)
    myMap.get(2)
    myMap.remove(2)
    myMap.get(2)
    println("")

}

fun test(node: Node) {
    node.value = 111
}
