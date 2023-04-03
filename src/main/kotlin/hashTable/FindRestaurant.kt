package hashTable

fun main() {

    var list1 = arrayOf("happy","sad","good")
    var list2 = arrayOf("sad","happy","good")

//    findRestaurant(list1, list2)

//    val colors = listOf("red", "brown", "grey")
//    val animals = listOf("fox", "bear", "wolf")
//    println(colors zip animals)

}

fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {

    val hashMap2 = list2.mapIndexed { index, value -> value to index }.toMap()

    val arrayList = arrayListOf<String>()

    var sum: Int
    var minSun = Int.MAX_VALUE

    list1.forEachIndexed { index, value ->

        if(hashMap2.containsKey(value)) {

            sum = index + hashMap2.get(value)!!

            if(sum < minSun) {
                arrayList.clear()
                arrayList.add(value)
                minSun = sum
            }else if(sum == minSun) {
                arrayList.add(value)
            }

        }// end if
    }

    return arrayList.toTypedArray()
}