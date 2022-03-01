package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.processors.PublishProcessor
import kr.soora.rxjavastudy.util.getThreadName

fun main() {
    val publisher: PublishProcessor<Int> = PublishProcessor.create<Int>()

    publisher.subscribe { println("${getThreadName()} 구독자1 $it") }
    publisher.onNext(1)
    publisher.onNext(2)
    publisher.onNext(3)

    publisher.subscribe { println("${getThreadName()} 구독자2 $it") }
    publisher.onNext(4)
    publisher.onNext(5)

    publisher.onComplete()
}
//[main] 구독자1 1
//[main] 구독자1 2
//[main] 구독자1 3
//[main] 구독자1 4
//[main] 구독자2 4
//[main] 구독자1 5
//[main] 구독자2 5