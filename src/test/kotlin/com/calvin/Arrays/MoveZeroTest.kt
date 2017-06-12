package com.calvin.Arrays

import org.junit.Test
import java.util.*
import kotlin.test.assertTrue

class MoveZeroTest {
   @Test
    fun shouldMoveZeroesToEnd() {
        val input = intArrayOf(0, 1, 0, 3, 0)
        val length = moveAndReturnNumberOfNonZeroes(input)
        val expected = intArrayOf(1, 3)
        assertTrue(Arrays.equals(expected, Arrays.copyOfRange(input, 0, length)))
    }

    @Test
    fun shouldNotMove() {
        val input: IntArray? = null
        moveAndReturnNumberOfNonZeroes(input)
        val expected: IntArray? = null
        assertTrue(Arrays.equals(expected, input))
    }
}
