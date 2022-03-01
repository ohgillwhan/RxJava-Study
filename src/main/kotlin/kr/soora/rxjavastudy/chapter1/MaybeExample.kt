package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Maybe

fun main() {
    val maybe = Maybe.create<Int> {
        it.onSuccess(1)

        it.onComplete()
    }

    maybe.subscribe(
            {println("$it!!") },
            {println("error! $it!!") },
            {println("Complete") }
        )

    Maybe.just(1)
        .subscribe(
            {println("$it!!") },
            {println("error! $it!!") },
            {println("Complete") }
        )

    Maybe.empty<Int>()
        .subscribe(
            {println("$it!!") },
            {println("error! $it!!") },
            {println("Complete") }
        )
}