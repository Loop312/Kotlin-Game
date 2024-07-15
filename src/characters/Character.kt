package characters

open class Character {
    //health values
    var maxHp = 10      //max health
    var hp = 10         //current health
    //damage values
    var str = 15        //physical damage (strength)
    var mag = 15        //magic damage
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
    var lck = 10        //luck
    var exp = 0         //experience
    var explimit = 10   //experience need to lvlup
    var alive = true

    //displays character stats
    //might need to shorten/rearrange stuff
    fun displayStats(){
        println("Name: $name\n" +
                "Hp: $hp/$maxHp    Exp: $exp/$explimit \n" +
                "Str: $str      Mag: $mag \n" +
                "Def: $def      Res: $res \n" +
                "Spd: $spd      Stamina: $stamina\n" +
                "Acc: $acc      Stealth: $stealth\n" +
                "Lck: $lck      Intel: $intel\n")
    }

    //levels up character
    //need to figure out how I want to implement lvl ups
    fun lvlup(){
        explimit *= 2
        exp = 0
    }

    //has the character take damage
    //physical damage
    fun strDmg (dmg: Int){
        hp = hp - (dmg - def)
        checkHp()
    }
    //magic damage
    fun magDmg (dmg: Int){
        hp = hp - (dmg - res)
        checkHp()
    }
    //checks if hp < 0
    fun checkHp() {
        if (hp < 0) {
            hp = 0
            alive = false
        }
    }
}
