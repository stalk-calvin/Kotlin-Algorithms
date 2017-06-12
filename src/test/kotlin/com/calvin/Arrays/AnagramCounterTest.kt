package com.calvin.Arrays

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class AnagramCounterTest {
    private var fixture: AnagramCounter? = null

    @Before
    fun setUp() {
        fixture = AnagramCounter()
    }

    @Test fun shouldReturnNumberOfChangesNeeded() {
        val expected = 4
        val actual = fixture!!.numberNeeded("cde", "abc")
        assertEquals(expected.toLong(), actual.toLong())
    }
}