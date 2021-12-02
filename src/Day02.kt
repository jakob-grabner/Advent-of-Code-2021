fun main() {


    val input = readInput("day02")
    println(part1(input))
    println("----------")
    println(part2(input))


}


private fun part1(input: List<String>): String {

    var depth = 0
    var pos = 0

    input.map {
        it.split(" ").let { (command, value) -> Pair(command, value.toInt()) }
    }.forEach { (command, value) ->
        when (command) {
            "up" -> depth -= value
            "down" -> depth += value
            "forward" -> pos += value
            else -> throw IllegalArgumentException("Unknown command $command")
        }
    }


    return "depth: $depth, pos: $pos, product: ${depth * pos}"

}


private fun part2(input: List<String>): String {

    var depth = 0
    var pos = 0
    var aim = 0

    input.map {
        it.split(" ").let { (command, value) -> Pair(command, value.toInt()) }
    }.forEach { (command, value) ->
        when (command) {
            "up" -> aim -= value
            "down" -> aim += value
            "forward" -> {
                depth += aim * value
                pos += value
            }
            else -> throw IllegalArgumentException("Unknown command $command")
        }
    }


    return "depth: $depth, pos: $pos, product: ${depth * pos}"

}