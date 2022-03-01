package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Single

fun main() {
    val single = Single.create<Int> {
        it.onSuccess(1)
    }

    single.subscribe { it ->
        println("$it!!")
    }

    Single.just(1)
        .subscribe { it ->
            println("$it!!")
        }
}