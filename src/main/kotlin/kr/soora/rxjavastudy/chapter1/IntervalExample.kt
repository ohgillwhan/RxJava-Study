package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import kr.soora.rxjavastudy.util.getThreadName
import java.util.concurrent.TimeUnit

fun main() {
    Observable.interval(100, TimeUnit.MILLISECONDS)
        .map { "${getThreadName()} $it Count" }
        .subscribe { println(it) }

    Thread.sleep(10000)
}