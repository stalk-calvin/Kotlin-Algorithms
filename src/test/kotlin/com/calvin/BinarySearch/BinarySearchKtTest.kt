package com.calvin.BinarySearch

import org.junit.Test
import kotlin.test.*

class BinarySearchKtTest {
    @Test fun shouldSearchInt() {
        val ordered = listOf<Int>(1,2,3,6,7,9,12,14,23,25)
        runTest(true, ordered, 25)
    }

    @Test fun shouldNotSearchInt() {
        val ordered = listOf<Int>(1,2,3,6,7,9,12,14,23,25)
        runTest(false, ordered, 4)
    }

    @Test fun shouldSearchString() {
        val ordered = listOf<String>("Adam", "Clark", "John", "Tim", "Zack")
        runTest(true, ordered, "John")
    }

    @Test fun shouldNotSearchString() {
        val ordered = listOf<String>("Adam", "Clark", "John", "Tim", "Zack")
        runTest(false, ordered, "James")
    }
}

fun <T:Comparable<T>> runTest(expected:Boolean, list:List<T>, key:T) {
    val actual = binarySearch(list, key)
    assertEquals(expected, actual, "\nkey = \"$key\" not found")
}
