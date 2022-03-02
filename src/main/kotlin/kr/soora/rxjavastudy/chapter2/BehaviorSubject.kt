package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.subjects.AsyncSubject
import io.reactivex.rxjava3.subjects.BehaviorSubject

fun main() {
    val subject = BehaviorSubject.create<Int>()

    subject.doOnNext { println("DO_ONNEXT 1 $it")}
        .subscribe { println("ON_NEXT 1 $it") }

    subject.onNext(200)

    subject.doOnNext { println("DO_ONNEXT 2 $it")}
        .subscribe { println("ON_NEXT 2 $it") }

    subject.onNext(300)

    subject.doOnNext { println("DO_ONNEXT 3 $it")}
        .subscribe { println("ON_NEXT 3 $it") }

    subject.onNext(400)

    subject.onComplete()

    subject.doOnNext { println("DO_ONNEXT 5 $it")}
        .subscribe { println("ON_NEXT 5 $it") }

    subject.onNext(300)
}