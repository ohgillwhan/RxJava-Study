package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.just(1, 3, 5, 6, 7)
        .doOnNext { println(it) }
        .all { it % 2 == 1 }
        .subscribe { it -> println(it) }
}