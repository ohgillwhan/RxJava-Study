package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import kr.soora.rxjavastudy.util.getThreadName
import java.time.LocalDateTime

fun main() {
    val defer = Observable.defer<LocalDateTime> { Observable.just(LocalDateTime.now()) }
    val just = Observable.just(LocalDateTime.now())

    defer.subscribe { println("${getThreadName()} DEFER $it") }
    just.subscribe { println("${getThreadName()} JUST $it") }
    Thread.sleep(3000)

    defer.subscribe { println("${getThreadName()} DEFER $it") }
    just.subscribe { println("${getThreadName()} JUST $it") }
}