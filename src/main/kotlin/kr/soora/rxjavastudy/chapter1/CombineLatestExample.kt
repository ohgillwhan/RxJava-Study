package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    val interval200 = Observable.interval(200, TimeUnit.MILLISECONDS)
        .skip(1)
        .take(5)

    val interval1000 = Observable.interval(1000, TimeUnit.MILLISECONDS)
        .skip(1)
        .take(3)
        .map { it * 100 }

    val interval400 = Observable.interval(510, TimeUnit.MILLISECONDS)
        .skip(1)
        .take(4)
        .map { it * 1000 }

    Observable.combineLatest(interval200, interval1000, interval400) { t1, t2, t3 -> t1 + t2 + t3 }
        .subscribe { println(it) }

    Thread.sleep(10000)
}