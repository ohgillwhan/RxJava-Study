package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.just(1, 3, 5, 7, 9, 3, 5)
        .distinct()
        .subscribe { println(it) }

    Observable.just("OH SOORA", "KING SOORA", "OH GILLWHAN", "KIM SOORA")
        .distinct { it.split(" ")[0] }
        .subscribe { println(it) }
}
