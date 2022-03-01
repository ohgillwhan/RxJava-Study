package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Observable
import kr.soora.rxjavastudy.util.getThreadName

fun main() {
    val just: Observable<String> = Observable.just("Hello", "Soora", "RxJava")
    just.subscribe {
        println("${getThreadName()} $it")
    }
}
