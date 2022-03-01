package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    Observable.interval(1, TimeUnit.SECONDS)
        .take(10)
        .subscribe (
            { println(it) },
            { println("ERROR") },
            { println("COMPLETE") }
        )

    Thread.sleep(20000)
}