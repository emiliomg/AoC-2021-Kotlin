package de.emiliomg.aoc.y2021

import java.lang.Exception

object Day2 {

    fun star1(data: List<String>): Int {
        data class SubPosition(val depth: Int, val horizontal: Int) {
            fun addForward(x: Int): SubPosition = this.copy(horizontal = this.horizontal + x)
            fun addDepth(x: Int): SubPosition = this.copy(depth = this.depth + x)
        }

        val result = data.fold(SubPosition(0, 0)) { position, command ->
            with(command) {
                val offset = command.split(" ").last().toInt()
                when {
                    startsWith("forward") -> position.addForward(offset)
                    startsWith("up") -> position.addDepth(-offset)
                    startsWith("down") -> position.addDepth(offset)
                    else -> throw Exception("zomg")
                }
            }
        }

        return result.depth * result.horizontal
    }
}