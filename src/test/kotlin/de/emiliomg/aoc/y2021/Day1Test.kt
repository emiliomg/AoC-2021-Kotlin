package de.emiliomg.aoc.y2021

import de.emiliomg.aoc.y2021.Util.asIntList
import de.emiliomg.aoc.y2021.Util.getInput
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class Day1Test : FunSpec({
    val prefix = "/y2021/day1"

    context("Day1") {
        context("Star1") {
            test("example") {
                val data = getInput("$prefix/example.txt").asIntList()
                Day1.star1(data) shouldBe 7
            }
            test("puzzle") {
                val data = getInput("$prefix/input.txt").asIntList()
                Day1.star1(data) shouldBe 1711
            }
        }

        context("Star2") {
            test("example") {
                val data = getInput("$prefix/example.txt").asIntList()
                Day1.star2(data) shouldBe 5
            }
            test("puzzle") {
                val data = getInput("$prefix/input.txt").asIntList()
                Day1.star2(data) shouldBe 1743
            }
        }
    }
})
