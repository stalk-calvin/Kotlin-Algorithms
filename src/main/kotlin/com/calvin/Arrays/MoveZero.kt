package com.calvin.Arrays

fun moveAndReturnNumberOfNonZeroes(A: IntArray?): Int {
    if (A == null) {
        return 0
    }
    var counter = 0
    var k = A.size - 1
    for (i in A.indices.reversed()) {
        if (A[i] == 0) {
            var x = i
            while (x < k) {
                val tmp = A[x + 1]
                A[x + 1] = A[x]
                A[x] = tmp
                x++
            }
            if (x >= k) {
                k--
            }
        } else {
            counter++
        }
    }
    return counter
}
