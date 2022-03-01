package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import kr.soora.rxjavastudy.util.getThreadName
import java.util.concurrent.TimeUnit

fun main() {
    Observable.timer(2, TimeUnit.SECONDS)
        .map { "DO WORK!" }
        .subscribe(
            { println("${getThreadName()} $it") },
            { println("${getThreadName()} $it Complete") }
        )

    Thread.sleep(5000)
}