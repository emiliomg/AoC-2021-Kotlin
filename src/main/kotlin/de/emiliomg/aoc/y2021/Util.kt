package de.emiliomg.aoc.y2021

object Util {
    inline fun <reified T> List<List<T>>.transpose(): List<List<T>> {
        val sourceRowNum = this.size
        val sourceColNum = this[0].size

        val result = Array(sourceColNum) { arrayOfNulls<T>(sourceRowNum) }

        this.forEachIndexed { soureRowIdx, sourceRow ->
            sourceRow.forEachIndexed { soureColIdx, pos ->
                result[soureColIdx][soureRowIdx] = pos
            }
        }

        return result.map { row -> row.map { it!! }.toList()}.toList()
    }
}