package adventofcode

import java.io.File

val integers = intArrayOf(0, 0, 0)

fun main() {

    integers.sort()
    integers[0]
    println(integers.toList())
    println(integers[0])

    var count = 0

    File("/Users/tan/data_structures/data_Structures_and_algorithms_Kotlin/src/main/kotlin/adventofcode/inputDay1.txt").forEachLine {

          if(it == ""){
              validate(count)
              count = 0
          }

        if(it != "") {
            count += it.toInt()


        }

    }// end file

    println(integers.toList().sum())

}

fun validate(count : Int) {
    if (integers[0] < count) {
        integers[0] = count
    }
    integers.sort()
}