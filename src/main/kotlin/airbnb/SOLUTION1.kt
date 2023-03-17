package airbnb

fun main() {
    val list = intArrayOf(1, 1, 2, 3, 3,9,9)
//    val list = intArrayOf(1, 1, 3)
    println(solution1(list, 2))
}

fun solution1(A: IntArray, K: Int): Boolean {

    val n = A.size

    for (i in 0 until n -1) {
        println(A[i])
        if (!(A[i] >= 1 && A[i] <= K))
            return false
    }
    if (!(A[n - 1] <= K))
        return false
    else
        return true
}