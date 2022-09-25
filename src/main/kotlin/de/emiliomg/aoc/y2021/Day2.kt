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

    fun star2(data: List<String>): Long {
        data class Sub(val depth: Long, val horizontal: Long, val aim: Long) {
            fun addForward(x: Long): Sub = this.copy(horizontal = this.horizontal + x)
            fun addDepth(x: Long): Sub = this.copy(depth = this.depth + x)
            fun addAim(x: Long): Sub = this.copy(aim = this.aim + x)
        }

        val result = data.fold(Sub(0, 0, 0)) { sub, command ->
            with(command) {
                val offset = command.split(" ").last().toLong()
                when {
                    startsWith("up") -> sub.addAim(-offset)
                    startsWith("down") -> sub.addAim(offset)
                    startsWith("forward") -> {
                        sub.addForward(offset).addDepth(sub.aim * offset)
                    }
                    else -> throw Exception("zomg")
                }
            }
        }

        return result.depth * result.horizontal
    }
}