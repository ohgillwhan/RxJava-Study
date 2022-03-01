package kr.soora.rxjavastudy.chapter1

import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Single

fun main() {
    val singleWithValue = Single.create<Int> {
        it.onSuccess(1)
    }

    Maybe.fromSingle(singleWithValue)
        .subscribe(
            {println("$it!!") },
            {println("error! $it!!") },
            {println("Complete") }
        )
}