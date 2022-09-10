package de.emiliomg.aoc.y2021

object Day1 {
    fun star1(data: List<Int>): Int =
        data
            .windowed(2)
            .map { it -> it.last() > it.first() }
            .filter { it }
            .size

    fun star2(data: List<Int>): Int {
        val preparedData = data
            .windowed(3)
            .map { it.sum() }
        return star1(preparedData)
    }
}