import characters.*

fun main() {
    val player = Human()
    player.displayStats()
    /*
    player.gainExp(12.0)
    player.displayStats()

    player.lvlup()
    player.displayStats()

    player.strDmg(15)
    player.displayStats()

     */
    println("LEVEL UP SIMULATOR TEST\n\n")
    player.lvlupSim(5)

}

