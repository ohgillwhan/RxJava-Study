package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import kr.soora.rxjavastudy.util.getThreadName

fun main() {
    val publisher = Observable.just(1, 2, 3, 4, 5)

    publisher.subscribe { println("${getThreadName()} 구독자1 $it") }
    publisher.subscribe { println("${getThreadName()} 구독자2 $it") }
}
