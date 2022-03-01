package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    Observable.range(0, 10000)
        .takeUntil { it == 4 }
        .subscribe { println(it) }

    println("===")
    Observable.interval(1000, TimeUnit.MILLISECONDS)
        .takeUntil(Observable.interval(5300, TimeUnit.MILLISECONDS))
        .subscribe { println(it) }

    Thread.sleep(10000)
}