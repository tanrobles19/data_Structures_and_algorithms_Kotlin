package algorithms

fun main() {

    val sortedList = intArrayOf(1,2,5,8,10,20,50,100,200, 4000)

    val item = 501

    binarySearch(sortedList, item)?.let {
        println("Element was Fount $it")
    }?: run {
        println("$item was not Found")
    }
}

/*Binary Search is a look-up algorithm, its input is a sorted list of elements.
* This algorithm runs in logarithmic time or log time.
* */

fun binarySearch(sortedList: IntArray, item: Int): Int? {

    var low = 0
    var high = sortedList.size -1

    while (low <= high) {

        // check the middle element of the list.
        val mid = (low + high) / 2
        val guess = sortedList[mid]

        if(guess == item) {
            // Found the Item.
            return item
        }else if(guess > item) {
            // The guess is too high
            high = mid - 1
        }else{
            // The guess is too Low
            low = mid + 1
        }

    }// end while

    // The Item doesn't exist
    return null

}// end fun binarySearch()