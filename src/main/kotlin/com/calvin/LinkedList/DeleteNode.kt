package com.calvin.LinkedList

/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

class DeleteNode {
    fun <T> deleteNode(node: ListNode<T>?): Unit {
        if (node != null) {
            node.value = node.next!!.value
            node.next = node.next!!.next
        }
    }
}
