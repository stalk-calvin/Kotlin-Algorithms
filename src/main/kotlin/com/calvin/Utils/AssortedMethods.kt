package com.calvin.Utils

import com.calvin.LinkedList.ListNode

/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

object AssortedMethods {
    fun createLinkedListFromIntArray(vals: IntArray): ListNode<Int> {
        var head: ListNode<Int> = ListNode(vals[0])
        var current: ListNode<Int>
        val tmpHead:ListNode<Int> = head
        for (i in 1..vals.size - 1) {
            current = ListNode(vals[i])
            head.next = current
            head = head.next!!
        }
        return tmpHead
    }
}

