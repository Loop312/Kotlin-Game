class Character {
    //health values
    var maxHp = 10      //max health
    var hp = 10         //current health
    //damage values
    var str = 10        //physical damage (strength)
    var mag = 10        //magic damage
    //defense values
    var def = 10        //physical defense
    var res = 10        //magic resistance
    //movement values
    var spd = 10        //speed
    var stamina = 10    //stamina
    //unique values
    var name = "Bob"    //character's name
    var stealth = 10    //stealth
    var acc = 10        //accuracy
    var intel = 10      //intelligence

    //displays character stats
    //might need to shorten/rearrange stuff
    fun displayStats(){
        println("Name: $name    Hp: $hp/$maxHp \n" +
                "Str: $str      Mag: $mag \n" +
                "Def: $def      Res: $res \n" +
                "Spd: $spd      Stamina: $stamina\n" +
                "Stealth: $stealth  Acc: $acc\n" +
                "Intel: $intel")
    }
}