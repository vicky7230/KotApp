package com.vicky7230.kotapp.domain.commands

/**
 * Created by vicky on 22/11/17.
 */
interface Command<out T> {
    fun execute(): T
}