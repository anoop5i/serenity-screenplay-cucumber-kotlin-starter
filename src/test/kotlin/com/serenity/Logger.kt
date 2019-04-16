package com.serenity

import org.slf4j.LoggerFactory

interface Logger {
    fun logger() = LoggerFactory.getLogger(this.javaClass)!!
}
