package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.functions.Function3
import java.util.concurrent.TimeUnit

fun main() {
    val interval200 = Observable.interval(200, TimeUnit.MILLISECONDS)
        .skip(1)
        .take(5)

    val interval300 = Observable.interval(300, TimeUnit.MILLISECONDS)
        .skip(1)
        .take(3)
        .map { it * 100 }

    val interval500 = Observable.interval(500, TimeUnit.MILLISECONDS)
        .skip(1)
        .take(4)
        .map { it * 1000 }

    Observable.zip(interval200, interval300, interval500) { t1, t2, t3 -> t1 + t2 + t3 }
        .subscribe { println(it) }

    Thread.sleep(10000)
}