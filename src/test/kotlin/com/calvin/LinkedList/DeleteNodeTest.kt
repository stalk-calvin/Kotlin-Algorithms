package com.calvin.LinkedList

import com.calvin.Utils.AssortedMethods
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

class DeleteNodeTest() {
    private var fixture: DeleteNode? = null
    private var listBase: ListNode<Int>? = null

    private val vals = intArrayOf(1, 2, 3)

    @Before
    fun setUp() {
        fixture = DeleteNode()
        listBase = AssortedMethods.createLinkedListFromIntArray(vals)
    }

    @Test
    fun shouldDeleteNode() {
        assertEquals(listBase!!.next!!.value, 2)
        assertEquals("1->2->3", listBase!!.printForward())
        fixture!!.deleteNode(listBase!!.next)
        assertEquals("1->3", listBase!!.printForward())
        assertEquals(listBase!!.next!!.value, 3)
    }

    @Test
    fun shouldNotDeleteSingleElement() {
        fixture!!.deleteNode(listBase!!.next)
        assertEquals("1->3", listBase!!.printForward())
    }
}
