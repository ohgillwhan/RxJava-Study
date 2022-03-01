package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.concurrent.TimeUnit

fun main() {
    println("START ${LocalDateTime.now()}")
    Observable.just(1, 2, 3, 4, 5)
        .doOnNext { println("BEFIRE $it ${LocalDateTime.now()}") }
        .delaySubscription(1000, TimeUnit.MILLISECONDS)
        .doOnNext { println("AFTER $it ${LocalDateTime.now()}") }
        .subscribe { println("Hello $it ${LocalDateTime.now()}") }

    Thread.sleep(2000)
}