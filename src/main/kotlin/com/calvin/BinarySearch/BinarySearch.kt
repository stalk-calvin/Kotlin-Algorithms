package com.calvin.BinarySearch

fun <T:Comparable<T>> binarySearch(list:List<T>, key:T) : Boolean {
    var rangeStart = 0
    var rangeEnd = list.count()
    while (rangeStart <= rangeEnd) {
        val midIndex = rangeStart + (rangeEnd - rangeStart)/2 // prevent overflow
        if (list[midIndex] == key) {
            return true
        } else if (list[midIndex] < key){
            rangeStart = midIndex + 1
        } else {
            rangeEnd = midIndex - 1
        }
    }
    return false
}
