package de.emiliomg.aoc.y2021

import de.emiliomg.aoc.y2021.TestUtil.asStringList
import de.emiliomg.aoc.y2021.TestUtil.getInput
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class Day3Test : FunSpec({
    val prefix = "/y2021/day3"

    context("Day3") {
        context("Star1") {
            test("example") {
                val data = getInput("$prefix/example.txt").asStringList()
                Day3.star1(data) shouldBe 198
            }
            test("puzzle") {
                val data = getInput("$prefix/input.txt").asStringList()
                Day3.star1(data) shouldBe 3309596
            }
        }

//        context("Star2") {
//            test("example") {
//                val data = getInput("$prefix/example.txt").asStringList()
//                Day3.star2(data) shouldBe 900
//            }
//            test("puzzle") {
//                val data = getInput("$prefix/input.txt").asStringList()
//                Day3.star2(data) shouldBe 1176514794
//            }
//        }
    }
})
