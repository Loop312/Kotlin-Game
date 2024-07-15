import characters.*

fun main() {
    val player = Human()
    player.displayStats()
    player.lvlup()
    player.displayStats()
    player.strDmg(15)
    player.displayStats()
}
