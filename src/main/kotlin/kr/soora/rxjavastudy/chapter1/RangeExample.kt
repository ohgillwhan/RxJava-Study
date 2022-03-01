package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import kr.soora.rxjavastudy.util.getThreadName

fun main() {
    Observable.range(10, 100)
        .subscribe { println("${getThreadName()} $it") }

    Thread.sleep(10000)
}