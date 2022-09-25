package de.emiliomg.aoc.y2021

import de.emiliomg.aoc.y2021.Util.asStringList
import de.emiliomg.aoc.y2021.Util.getInput
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class Day2Test : FunSpec({
    val prefix = "/y2021/day2"

    context("Day2") {
        context("Star1") {
            test("example") {
                val data = getInput("$prefix/example.txt").asStringList()
                Day2.star1(data) shouldBe 150
            }
            test("puzzle") {
                val data = getInput("$prefix/input.txt").asStringList()
                Day2.star1(data) shouldBe 1488669
            }
        }

        context("Star2") {
            test("example") {
                val data = getInput("$prefix/example.txt").asStringList()
                Day2.star2(data) shouldBe 900
            }
            test("puzzle") {
                val data = getInput("$prefix/input.txt").asStringList()
                Day2.star2(data) shouldBe 1176514794
            }
        }
    }
})
