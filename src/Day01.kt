fun main() {

    val input = readInput("day01")
    part1(input)
    println("----------")
    part2(input)

}

private fun part1(input: List<String>) {
    var result = 0
    input
        .map { it.toInt() }
        .reduce { prev, curr -> if (curr > prev) result++; curr }
    println(result)
}

private fun part2(input: List<String>) {
    var result = 0

    input
        .map { it.toInt() }
        .windowed(size = 3) { w ->
            w.sum()
        }.reduce { prev, curr -> if (curr > prev) result++; curr }

    println(result)
}