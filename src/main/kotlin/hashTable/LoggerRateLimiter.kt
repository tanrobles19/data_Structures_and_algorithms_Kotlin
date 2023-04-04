package hashTable

val hashMap = hashMapOf<String, Int>()

fun main() {

}

fun shouldPrintMessage(timestamp: Int, message: String): Boolean {

    if(!hashMap.containsKey(message)) {
        hashMap.put(message, timestamp + 10)
        return true
    }else{
        if(timestamp < hashMap.get(message)!! ) {
            return false
        }else{
            hashMap.put(message, timestamp + 10)
            return false
        }
    }

}