package com.calvin.LinkedList

/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

class ListNode<T>(_value: T){
    internal var value: T? = null
    internal var next: ListNode<T>? = null

    init {
        value = _value
        next = null
    }

    fun printForward(): String {
        if (next != null) {
            return value.toString() + "->" + next!!.printForward()
        } else {
            return value.toString()
        }
    }
}
