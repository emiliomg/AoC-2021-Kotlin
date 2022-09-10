package de.emiliomg.aoc.y2021

object Util {
    fun getInput(rawPath: String): String {
        val path = if(rawPath.startsWith("/")) rawPath else "/$rawPath"
        val data = object {}.javaClass.getResource(path)?.readText()

        return data!!
    }
}