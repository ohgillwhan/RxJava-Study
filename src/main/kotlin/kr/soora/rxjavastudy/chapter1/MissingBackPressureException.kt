package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.schedulers.Schedulers
import kr.soora.rxjavastudy.util.getThreadName
import java.util.concurrent.TimeUnit

fun main() {
    Flowable.interval(1L, TimeUnit.MILLISECONDS)
        .doOnNext { println("${getThreadName()} $it PubPub") }
        .observeOn(Schedulers.computation())
        .subscribe (
            {
                println("${getThreadName()} 데이터 처리중")
                Thread.sleep(1000)
                println("${getThreadName()} $it 완료!")
            },{
                println("${getThreadName()} $it")
            }
        )

    Thread.sleep(2000)
}