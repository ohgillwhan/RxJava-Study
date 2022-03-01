package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.range(0, 100)
        .filter { it % 2 == 0 }
        .filter { it < 10 }
        .map { "$it good" }
        .subscribe { println("$it") }
}