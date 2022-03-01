package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import java.time.LocalDateTime
import java.util.concurrent.TimeUnit

fun main() {
    Observable.range(0, 10)
        .skip(3)
        .subscribe { println(it) }

    println("----- ${LocalDateTime.now()}")
    Observable.interval(1000, TimeUnit.MILLISECONDS)
        .skip(4300, TimeUnit.MILLISECONDS)
        .subscribe { println("${LocalDateTime.now()} $it") }

    Thread.sleep(10000)
}