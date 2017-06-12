package com.calvin.Arrays

/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

fun numberNeeded(first: String, second: String): Int {
    var count = 0
    val freq = IntArray(26)
    for (c in first.toCharArray()) freq[c - 'a']++
    for (c in second.toCharArray()) freq[c - 'a']--
    for (i in freq) count += Math.abs(i)
    return count
}
