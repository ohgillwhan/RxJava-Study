package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.subjects.PublishSubject

fun main() {
    val publishSubject = PublishSubject.create<Int>()

    publishSubject.subscribe { println("1 $it") }
    publishSubject.onNext(100)

    publishSubject.subscribe { println("2 $it") }
    publishSubject.onNext(100)

    publishSubject.subscribe { println("3 $it") }
    publishSubject.onNext(100)

    publishSubject.subscribe(
        { println("4 $it") },
        { println("4 error") },
        { println("4 complete") }
    )

    publishSubject.onComplete()
}