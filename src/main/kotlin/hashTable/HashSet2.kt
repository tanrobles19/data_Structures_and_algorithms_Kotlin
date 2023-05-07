package hashTable

class HashSet2() {

    data class Slot(var list: ArrayList<Int>) {}

    private val list = arrayOfNulls<Slot>(512)

    fun add(key: Int) {

        if(!contains(key)) {

            val slot = list[modularHashing(key)]

            if(slot == null)
                list[modularHashing(key)] = Slot(arrayListOf(key))
            else
                slot.list.add(key)

        }

    }

    fun remove(key: Int) {
        if(contains(key)) {
            list[modularHashing(key)]?.list?.remove(key)
        }
    }

    fun contains(key: Int): Boolean {

        list[modularHashing(key)]?.list?.forEach {
            if(key == it) {
                return true
            }
        }
        return false
    }// end contains()

    private fun modularHashing(key: Int) : Int{
        return key % list.size
    }

}