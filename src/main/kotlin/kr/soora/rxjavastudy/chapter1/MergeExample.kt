package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    val oneSecond = Observable.interval(1000, TimeUnit.MILLISECONDS)
        .skip(1)
        .take(5)

    val twoSecond = Observable.interval(2000, TimeUnit.MILLISECONDS)
        .skip(1)
        .take(5)
        .map { it * 1000 }

    Observable.merge(oneSecond, twoSecond)
        .subscribe { println(it) }

    Thread.sleep(10000)
}