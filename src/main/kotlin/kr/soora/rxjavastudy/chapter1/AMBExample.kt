package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    val first = Observable.interval(100, TimeUnit.MILLISECONDS)
        .take(5)

    val second = Observable.interval(200, TimeUnit.MILLISECONDS)
        .take(5)
        .map { -it }

    Observable.amb(listOf(first, second))
        .subscribe { println(it) }

    Thread.sleep(5000)
}