package leetCode

import kotlin.random.Random

fun main() {

    val list = arrayListOf<Int>()

    for (i in 0..100000000) {
        var num = Random.nextInt(0, 10000)
        list.add(num)
//        println(num)
    }

//    findDuplicates(list)
    findDuplicatedSet(list)

}

fun findDuplicatedSet(list : ArrayList<Int>) {

    val hashSet = hashSetOf<Int>()

    for (value in list) {
        hashSet.add(value)
    }
    println("No Duplicated")
    println(hashSet.size)
}

fun findDuplicates(list : ArrayList<Int>) {

    val noDuplicateList = arrayListOf<Int>()
    var numComparations = 0

    list.forEachIndexed { index, value ->

        val num = value
        var isDuplicate = false

        noDuplicateList.forEachIndexed { i, v ->
            numComparations++
            if(num == v && index != i ) {
                isDuplicate = true
            }
        }

        if(!isDuplicate) {
            noDuplicateList.add(num)
        }

    }// end for

    println("No Duplicated")
    println("Comparations: $numComparations")
    println("Comparations: ${noDuplicateList.size}")

//    noDuplicateList.forEach {
//        println(it)
//    }
}