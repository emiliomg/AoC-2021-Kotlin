package de.emiliomg.aoc.y2021

import de.emiliomg.aoc.y2021.Util.transpose

object Day3 {
    fun star1(raw: List<String>): Long {
        val report = raw.map { it.toCharArray().toList() }
        val data = report.transpose()

        return 1L
    }
}