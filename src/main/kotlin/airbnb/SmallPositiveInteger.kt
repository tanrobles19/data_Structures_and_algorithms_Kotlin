package airbnb

fun main() {

    val list = intArrayOf(-1, -3)

    println(solution(list))

}

fun solution(A: IntArray): Int {

    val hashSet = hashSetOf<Int>()

    A.forEach {value ->
        hashSet.add(value)
    }

    var smallest = 1 // small positive

    for (i in (0..hashSet.size)) {

        if(hashSet.contains(smallest)) {
            smallest++
        }else{
            return smallest
        }

    }
//        println(smallest)

 return smallest
}