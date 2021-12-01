fun main() {
    fun part1(input: List<String>) {
        println(
            input.windowed(size = 2) { (a, b) ->
//            println("$a, $b -> ${b > a}")
                b > a
            }.count { it }
        )
    }

    fun part2(input: List<String>) {
        println(
            input
                .map { it.toInt() }
                .windowed(size = 3) { w ->
                    w.sum()
                }.windowed(size = 2) { (a, b) ->
//                    println("$a, $b -> ${b > a}")
                    b > a
                }.count { it }
        )
    }


    val input = readInput("day01")
    part1(input)
    println("----------")
    part2(input)

}
