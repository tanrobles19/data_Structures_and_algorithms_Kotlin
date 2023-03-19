package hashTable

//import java.util.ArrayList

fun main() {

    val hashMap = hashMapOf<Int, String>()

    hashMap.putIfAbsent(1, "Lu")
    hashMap.putIfAbsent(2, "Issac")
    hashMap.putIfAbsent(3, "Eithan")
    hashMap.putIfAbsent(4, "Tan")
    hashMap.putIfAbsent(5, "Tan")

    hashMap.put(1, "LUCRECIA")
    hashMap.put(5, "Jonathan")

    hashMap.remove(4)

    val keyList = ArrayList(hashMap.values)

    keyList.random()

    repeat((1..10).count()) {
        println(keyList.random())
    }

//    hashMap.values.forEach{ value ->
//        println(value)
//    }

}