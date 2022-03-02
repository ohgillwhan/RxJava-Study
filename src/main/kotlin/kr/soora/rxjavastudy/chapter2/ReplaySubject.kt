package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.subjects.BehaviorSubject
import io.reactivex.rxjava3.subjects.PublishSubject
import io.reactivex.rxjava3.subjects.ReplaySubject

fun main() {
    val subject = ReplaySubject.create<Int>()

    subject.onNext(100)

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

    println("========================")
    val subject2 = ReplaySubject.createWithSize<Int>(2)

    subject2.onNext(100)

    subject2.doOnNext { println("DO_ONNEXT 1 $it")}
        .subscribe { println("ON_NEXT 1 $it") }

    subject2.onNext(200)

    subject2.doOnNext { println("DO_ONNEXT 2 $it")}
        .subscribe { println("ON_NEXT 2 $it") }

    subject2.onNext(300)

    subject2.doOnNext { println("DO_ONNEXT 3 $it")}
        .subscribe { println("ON_NEXT 3 $it") }

    subject2.onNext(400)

    subject2.onComplete()

    subject2.doOnNext { println("DO_ONNEXT 5 $it")}
        .subscribe { println("ON_NEXT 5 $it") }

    subject2.onNext(300)

}