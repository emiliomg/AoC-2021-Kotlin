package de.emiliomg.aoc.y2021

import de.emiliomg.aoc.y2021.Util.transpose
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class UtilTest : DescribeSpec({
    context("transpose") {
        withData(
            Pair(
                listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9)),
                listOf(listOf(1, 4, 7), listOf(2, 5, 8), listOf(3, 6, 9))
            ),
            Pair(
                listOf(listOf(1, 2), listOf(3, 4), listOf(5, 6)),
                listOf(listOf(1, 3, 5), listOf(2, 4, 6)),
            ),
            Pair(
                listOf(listOf(1), listOf(2), listOf(3), listOf(4), listOf(5)),
                listOf(listOf(1, 2, 3, 4, 5))
            )
        ) { (check, expectation) ->
            check.transpose() shouldBe expectation
        }
    }
})
