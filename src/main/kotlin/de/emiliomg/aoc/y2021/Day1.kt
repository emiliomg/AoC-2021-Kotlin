package de.emiliomg.aoc.y2021

object Day1 {
    fun star1(data: List<String>): Int =
        data
            .map { it.toInt() }
            .windowed(2)
            .map { it -> it.last() > it.first() }
            .filter { it }
            .size
}