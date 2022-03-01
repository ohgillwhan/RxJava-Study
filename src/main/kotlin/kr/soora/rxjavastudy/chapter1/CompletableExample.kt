package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Completable

fun main() {
    val completable = Completable.create { completable ->
        val sum = (0..100).sum()

        completable.onComplete()
    }

    completable.subscribe {
        println("COMPLETE")
    }
}