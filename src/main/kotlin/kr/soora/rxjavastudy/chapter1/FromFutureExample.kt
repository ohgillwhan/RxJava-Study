package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import kr.soora.rxjavastudy.util.getThreadName
import java.util.concurrent.CompletableFuture

fun main() {
    val future = CompletableFuture.supplyAsync { executeLongProcess() }

    executeShortProcess()

    Observable.fromFuture(future)
        .map { "$it GOOD" }
        .subscribe { println("${getThreadName()} $it ^_^")}

    Thread.sleep(10000)
}

fun executeLongProcess(): String {
    println("${getThreadName()} execute Long Process")
    Thread.sleep(5000)
    println("${getThreadName()} finish Long Process")

    return "FINISH!"
}

fun executeShortProcess() {
    println("${getThreadName()} execute Short Process")
    Thread.sleep(2000)
    println("${getThreadName()} finish Short Process")
}