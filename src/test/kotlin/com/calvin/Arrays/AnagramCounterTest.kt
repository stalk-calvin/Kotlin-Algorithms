package com.calvin.Arrays

import org.junit.Test
import kotlin.test.assertEquals

class AnagramCounterTest {
    @Test fun shouldReturnNumberOfChangesNeeded() {
        val expected = 4
        val actual = numberNeeded("cde", "abc")
        assertEquals(expected.toLong(), actual.toLong())
    }
}