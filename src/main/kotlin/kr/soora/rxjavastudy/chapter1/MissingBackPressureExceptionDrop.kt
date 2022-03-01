package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.BackpressureOverflowStrategy
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.schedulers.Schedulers
import kr.soora.rxjavastudy.util.getThreadName
import java.util.concurrent.TimeUnit

fun main() {
    Flowable.interval(300L, TimeUnit.MILLISECONDS)
        .doOnNext { println("${getThreadName()} $it PubPub") }
        .onBackpressureDrop { println("${getThreadName()} ${it} DROP!!") }
        .doOnNext { println("${getThreadName()} $it OnBackpressureBuffer PubPub") }
        .observeOn(Schedulers.computation(), false, 3)
        .subscribe (
            {
                println("${getThreadName()} $it 데이터 처리중")
                Thread.sleep(1000)
                println("${getThreadName()} $it 완료!")
            },{
                println("${getThreadName()} $it")
            }
        )

    Thread.sleep(4000)
}