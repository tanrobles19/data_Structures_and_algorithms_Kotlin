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

    val hashMap = hashMapOf<String, Int>()
    val resultArrayList = arrayListOf<String>()

    var min = Int.MAX_VALUE

    list1.forEachIndexed { index, value ->
        hashMap.put(value, index)
    }

    list2.forEachIndexed { index, value ->
        if(hashMap.containsKey(value)) {

            val sum = index + hashMap.get(value)!!

            if(sum < min) {
                resultArrayList.clear()
                resultArrayList.add(value)
                min = sum
            }else if( sum == min ){
                resultArrayList.add(value)
            }

        }
    }// end forEach

    return resultArrayList.toTypedArray()

}